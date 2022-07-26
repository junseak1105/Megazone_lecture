package console.common.servlet;

import console.common.cmd.BaseCommand;
import console.common.cmd.CommandManager;
import lombok.ToString;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaseServlet
 */

public abstract class BaseController extends HttpServlet {
    Map map = new HashMap();

    public BaseCommand command;
    public String cmdkey = "cmdkey";
    private String nextPage = null;

    public String cmd;

    public String JspCmd(String cmd){
        return cmd +=".jsp";
    }
    @Override
    public void init() throws ServletException {
        getServletContext().setAttribute(cmdkey, CommandManager.getMapping());
    }// init

    public BaseCommand getCommand(String cmd) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Map map = (Map) getServletContext().getAttribute(cmdkey);

        if (!(cmd.equals("") || cmd == null)) {
            cmd = map.get(cmd).toString();
            command = (BaseCommand) Class.forName(cmd).newInstance();
        }

        return command;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doControlService(request, response);
    }//doget

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doControlService(request, response);
    }//dopost

    protected abstract void doControlService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;


    //값을 담을 메서드
    protected Map Request_Tray(HttpServletRequest request) throws ServletException, IOException {
        Enumeration e = request.getParameterNames();
        while (e.hasMoreElements()) {
            String key = e.nextElement().toString();
            String[] value = request.getParameterValues(key);
            map.put(key, value[0]);
//            System.out.println("key:"+key+" value:"+value[0]);
        }
        return map;
    }//Request_Tray

    protected void doControlForward(HttpServletRequest request, HttpServletResponse response, String page) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }//doForward

    @Override
    public void destroy() {
        System.out.println("[Servlet stat] : Servlet Killed.");
    }//destroy

    protected String get(String key) {
        return map.get(key).toString();
    }//Map_get()

    protected void setNextPage(String nextPageObj) {
        nextPage = nextPageObj;
    }

    public String getNextPage() throws Exception {
        System.out.println("[get next page] : " + nextPage);
        if (nextPage == null) {
            System.out.println("Get next page null");
        }
        return nextPage;
    }

}