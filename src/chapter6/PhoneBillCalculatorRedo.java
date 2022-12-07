package chapter6;

public class PhoneBillCalculatorRedo {
    int id;
    double plan;
    double allottedMinutes;
    double usedMinutes;

    public PhoneBillCalculatorRedo(){
        setId(0);
        setPlan(79.99);
        setAllottedMinutes(800);
        setUsedMinutes(800);
    }

    public PhoneBillCalculatorRedo(int id){
        setId(id);
        setPlan(79.99);
        setAllottedMinutes(800);
        setUsedMinutes(800);
    }

    public PhoneBillCalculatorRedo(int id ,double plan , double allottedMinutes , double usedMinutes){
        setId(id);
        setPlan(plan);
        setAllottedMinutes(allottedMinutes);
        setUsedMinutes(usedMinutes);
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setPlan(double plan){
        this.plan = plan;
    }

    public double getPlan(){
        return plan;
    }

    public void setAllottedMinutes(double allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public double getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setUsedMinutes(double usedMinutes){
        this.usedMinutes = usedMinutes;
    }

    public double getUsedMinutes(){
        return usedMinutes;
    }


    public double calculateTax(){
        // rate = 0.15
        double tax = (getPlan() + calculateOverage()) * 0.15;
        return tax;
    }

    public double calculateOverage(){
        if(usedMinutes<=allottedMinutes) return 0;
        // rate = 0.25
        double overage = (usedMinutes - allottedMinutes) * 0.25;
        return overage;
    }

    public double calculateTotalBill(){
        return getPlan() + calculateTax() + calculateOverage() ;
    }

    public void printBill(){
        System.out.println("Phone Bill Statement \nId:  "+getId()+"\nPlan:  $"+ getPlan()+"\nOverage:  $"+
                calculateOverage()+"\nTax:  $"+calculateTax()+"\n" +
                "Total:  $"+calculateTotalBill());
    }



}
