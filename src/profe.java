 public class profe extends  persona {
        private String  style ;
    
        public profe (String name , String style){
            super (name) ;
            this.style = style ; 
        }

        @Override

        public void presentarse () {
            super.presentarse();
            System.out.println("Dicto : " +style);
        }
    }