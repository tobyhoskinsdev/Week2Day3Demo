package examples.aaronhoskins.com.week2day3demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import examples.aaronhoskins.com.week2day3demo.models.Employee;
import examples.aaronhoskins.com.week2day3demo.models.Person;

public class MainActivity extends AppCompatActivity {
    TextView tvDisplay;
    Employee employee;
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tvDisplay = (TextView)findViewById(R.id.tvDisplay);
        tvDisplay = findViewById(R.id.tvDisplay);
        initEmployee();
        initPerson();
        Log.d("TAG", "onCreate:" + recussiveMethod("RUN", 0));
        tvDisplay.setText(person.getFirstName() + " " + person.getLastName());
    }

    public String recussiveMethod(String string, int controlVar) {
        String returnString = string;
        while(controlVar < 10) {
            Log.d("TAG", "recussiveMethod: " + returnString);
            recussiveMethod(string + controlVar, controlVar+=1);
        }
        return returnString + controlVar;
    }

    public void initEmployee() {
       employee = new Employee("Aaron",
               "Hoskins",
               "You Have A ID TEN T Error",
               "Entry Level",
               15.00);

        employee.doNotDoThis = "HAHAHA";  //AGAIN DO NOT DO THIS

        employee.talk();
    }

    public void initPerson() {
        person = new Person("Aaron",
                "Hoskins",
                "DONT");
        //person.alsoDoNotDoThisUnlessYouKnowForSure
        person.talk();
    }
}
