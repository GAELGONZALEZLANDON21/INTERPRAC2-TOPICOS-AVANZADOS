
package operaciones.operatext;

public class OperaRFC {
    private String nombre;
    private String apPat;
    private String apMat;
    private String fechaNac;
    
    public OperaRFC(String nombre, String apPat, String apMat, String fechaNac){
        this.nombre = nombre.toUpperCase();
        this.apPat = apPat.toUpperCase();
        this.apMat = apMat.toUpperCase();
        this.fechaNac = fechaNac;
    }
         
    public String generarRFC(){
        String rfc = "";
        
        rfc += apPat.charAt(0);
        rfc += obtenerPrimeraVocalInterna(apPat);
        rfc += apMat.charAt(0);
        rfc += nombre.charAt(0);
        
        String[] fechaPartes = fechaNac.split("-");
        String año = fechaPartes[0].substring(2);
        String mes = fechaPartes[1];
        String dia = fechaPartes[2];
        
        rfc += año + mes + dia;
        return rfc;
    }
    
    private char obtenerPrimeraVocalInterna(String texto){
        for (int i= 1; i < texto.length(); i++){
            char c = texto.charAt(i);
            if ("AEIOU".indexOf(c) != -1) {
            return c;
            }
        }
        return 'X';
        
    }
    
}
