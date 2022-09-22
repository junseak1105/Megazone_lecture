package book.common;


import java.io.IOException;

import java.util.Enumeration;

import java.util.Hashtable;

import java.util.Map;


import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ControllerServlet
 */


public class SimpleController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    CommandHandler command;

    String path;

    Hashtable hash = new Hashtable();

    Hashtable hashrequest = new Hashtable();


    public String key = "init_key";


    public Map RequestTray(HttpServletRequest request) {

        Enumeration en = request.getParameterNames();


        while (en.hasMoreElements()) {

            String key = en.nextElement().toString();

            String value[] = request.getParameterValues(key);

            hashrequest.put(key, value[0]);

        }

        return hashrequest;

    }


    public Hashtable getCmdMapping() {

        hash.put("BoardList", "book.common.BoardListHandler");

        hash.put("BoardWriteForm", "book.common.BoardWriteFormHandler");

        hash.put("BoardUpdateForm", "book.common.BoardUpdateFormHandler");

        hash.put("BoardDetailListForm", "book.common.BoardDetailListFormHandler");


        return hash;

    }


    @Override

    public void init() throws ServletException {

        getServletContext().setAttribute(key, getCmdMapping());

    }


    public CommandHandler getCommand(String cmd) {

        Hashtable mapkey = (Hashtable) getServletContext().getAttribute(key);

        CommandHandler handler = null;


        cmd = mapkey.get(cmd).toString();


        try {

            handler = (CommandHandler) Class.forName(cmd).newInstance();

        } catch (Exception e) {

// TODO Auto-generated catch block

            e.printStackTrace();

        }

        return handler;

    }


    /**
     * @see HttpServlet#HttpServlet()
     */

    public SimpleController() {

        super();

// TODO Auto-generated constructor stub

    }


    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * <p>
     * response)
     */

    protected void doGet(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {


        ProcessRequest(request, response);

    }


    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * <p>
     * response)
     */

    protected void doPost(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

// TODO Auto-generated method stub


        ProcessRequest(request, response);

    }


    protected void ProcessRequest(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {


        String path = "/book/ch18_2next.jsp";

        String cmd = request.getParameter("cmd");

        Object resultob = null;


        System.out.println("cmd:" + cmd);

// BoardList

// BoardWriteForm


        Map map = RequestTray(request);

        CommandHandler handler = getCommand(cmd);

        path = handler.process(request, map);


// request.setAttribute("type", resultob);

        ProcessForward(request, response, path);

    }


    protected void ProcessForward(HttpServletRequest request, HttpServletResponse response, String path)

            throws ServletException, IOException {


        RequestDispatcher rs = request.getRequestDispatcher(path);

        rs.forward(request, response);

    }


}