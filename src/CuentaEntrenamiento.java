public class CuentaEntrenamiento {

    private int hoursTrainning = 0 ; 

    public void  agregarHoras (int horas ){
        if (horas > 0){
            this.hoursTrainning += horas ; 
        }
    }

    public int  getHoursTrainning  () {
        return  hoursTrainning;
    }

    
}
