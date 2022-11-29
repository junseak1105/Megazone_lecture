package console.common.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class DiabloIndexBean {
    public String homename;
    public String boardname;
    public String boardlink;
    public final String menuname;
    public final String menulink;
    public String userid;


}
