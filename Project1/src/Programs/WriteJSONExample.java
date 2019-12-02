
/*import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class WriteJSONExample
{
    public static void main( String[] args )
    {
        //First Employee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Lokesh");
        employeeDetails.put("website", "howtodoinjava.com");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employee Details);

        //Second Employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Brian");
        employeeDetails2.put("website", "example.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employee Details2);

        //Add employees to list
        JSONArray employeeList = new JSONArray();
        employee List.add(employeeObject);
        employee List.add(employeeObject 2);

        //Write JSON file
        try (FileWriter file = new FileWriter("employees.json")) {

            file.write(employee List.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} */