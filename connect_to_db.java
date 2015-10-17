import java.sql.* ;
 import java.io.* ;


 public  class TestDB {

    public  static  void main (String[] args) {
       
        try {
          // chargement de la classe par son nom
       String myurl="jdbc:mysql://127.0.0.1:3306/cloud_test";
            Class c = Class.forName("com.mysql.jdbc.Driver") ;
         Driver pilote = (Driver)c.newInstance() ;
         DriverManager.registerDriver(pilote); 
         Connection con = DriverManager.getConnection(myurl,"mysqlusername","mysqlpassword" ) ;

          // Envoi d’un requête générique
         String sql =  "select * from test" ;
         Statement smt = con.createStatement() ;
         ResultSet rs = smt.executeQuery(sql) ;
          while (rs.next()) {
            System.out.println("id= "+rs.getString("id")+" name: "+rs.getString("name")+" ") ;
         }
      }  catch (Exception e) {
          // gestion des exceptions
      }
   }
}
