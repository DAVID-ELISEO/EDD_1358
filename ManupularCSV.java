private BufferedReader lector;//Lee el archivo
private String Linea; //recibe la linea de cada fila
private String partes []*null;//almacena cada linea leida

public void leerArchivo(String nombreArchivo){
   try{
       lector=new BuffereReader(new FileReader(nombreArchivo));
       while ((linea=lector.readLine()) !null){
             partes= Linea.split(regex: ",");
             imprimirLinea();
             System.out.println();
      }
      lector.close();
      linea=null;
      partes=null;
   }     catch(Exception e){
  JOptionPane.showMessageDialog(parentComponent null, e);
   }

}

public void imprimirLinea (){
      for (int i=0;  i< partes.length; i++) {
      System.out.print(partes[i]+ " |");
     }
  }
}





public class ManupularCSV {
    
}
