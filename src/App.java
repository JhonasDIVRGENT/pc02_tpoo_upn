public class App {
    public static void main(String[] args)  {

      
 System.out.println("---");
        CuentaEntrenamiento cuenta = new CuentaEntrenamiento () ; 
        cuenta.agregarHoras(3);
        cuenta.agregarHoras(2);
        cuenta.agregarHoras(10);

        CuentaEntrenamiento cuenta2 = new CuentaEntrenamiento () ;
        cuenta2.agregarHoras(3);
        cuenta2.agregarHoras(5);

 System.out.println("---");

        System.out.println("horas totales dia 1= " + cuenta.getHoursTrainning()) ;
        System.out.println("horas entreamiento dia2  = " + cuenta2.getHoursTrainning());

        persona p1 = new persona ("Jonathan");
        p1.presentarse();

 System.out.println("---");
        profe prof1 = new profe ("Lu" ,"Ballet");
        prof1.presentarse();

        persona p2 = new profe ("Juan" , "Salsa");
        p2.presentarse();
        




       
    }
}
