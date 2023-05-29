package advancedFeatureTestNG.groupingFeatures;

import org.testng.annotations.Test;

public class GroupingExample1 {
    @Test(groups = {"BreakFast","Food"})
    void MyTestA(){
        System.out.println("I am Eating Banana");
    }

    @Test(groups = "BreakFast")
    void MyTestB(){
        System.out.println("I am Eating Cake");
    }

    @Test(groups = "BreakFast")
    void MyTestC(){
        System.out.println("I am Eating Pastry");
    }
    @Test(groups = "Lunch")
    void MyTestD(){
        System.out.println("I am Eating Pizza");
    }
    @Test(groups = "Lunch")
    void MyTestE(){
        System.out.println("I am Drinking Tea ");
    }

    @Test(groups = "Dinner")
    void MyTestF(){
        System.out.println("I am Eating Snacks ");
    }
}
