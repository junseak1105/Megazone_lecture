package book.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Connection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardDao {
    private String numberindex;
    private String userid;
    private String subject;
    private String currentdate;
    
}
