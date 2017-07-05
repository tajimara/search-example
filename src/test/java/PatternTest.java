import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chojang on 15. 5. 21..
 */

public class PatternTest {
    @Test
    public void test() {
        String dbType = "";
        String dbAddr ="";
        String dbName = "";
        String url = "jdbc:sqlserver://116.125.126.195;databaseName=JOBSEARCH;ㅋㅌㅊㅁㄴㄹㅇㅁㄴㄹ;ㅇㄹㄴㅇㄹ;";
        Pattern questionPattern = Pattern.compile(";.*");
        Matcher matcher;

        dbType = "MS-SQL";
        Pattern mssqlAddrPattern = Pattern.compile("(?<=jdbc:sqlserver://)(.*)(?=;\\w+)");
        Pattern mssqlNamePattern = Pattern.compile("(?<=databaseName=).*");
        matcher = mssqlAddrPattern.matcher(url);
        if (matcher.find()) {
            dbAddr = matcher.group(0);
        }
        url = url.replace("jdbc:sqlserver://", "");
        matcher = mssqlNamePattern.matcher(url);
        url = url.replace(dbAddr, "");
        if (matcher.find()) {
            dbName = matcher.group(0);
        }
        matcher = questionPattern.matcher(dbName);
        if (matcher.find()) {
            dbName = dbName.replace(matcher.group().toString(), "");
        }
//

        System.out.println(dbType);
        System.out.println(dbName);
        System.out.println(dbAddr);
    }

}
