import com.mongodb.*;

import java.net.UnknownHostException;
/*
AUTHOR: Swarup Dey Sarkar
*/

public class MongoDB {
    public static MongoClient mongoClient;
    public static DB database;
    public static DBCollection test;
    public static void main(String[] args) throws UnknownHostException {
        mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));

        //creating db
        database = mongoClient.getDB("EmployeeDb");

        //creating collection
        test = database.getCollection("employee");

        //insertion
        TestObject testObject = new TestObject();
        testObject.setEmployeeID(100);
        testObject.setEmployeeName("Swarup");
        test.insert(convert(testObject));

        //fetching
        DBObject query = new BasicDBObject("EmployeeID", 100);
        TestObject newMod = new TestObject();
        DBCursor cursor = test.find(query);

        //printing
        System.out.println(cursor.one());

    }

    public static DBObject convert(TestObject testObj){
        return new BasicDBObject("EmployeeID", testObj.getEmployeeID()).append("EmployeeName", testObj.getEmployeeName());
    }
}
