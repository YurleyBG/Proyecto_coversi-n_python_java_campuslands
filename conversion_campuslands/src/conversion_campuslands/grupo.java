
package conversion_campuslands;

import java.util.List;
import java.util.Map;

public class grupo {
    String ruta;
    Map<String, Object> modulos;
    String Nombre;
    String fecha_inicio;
    String fecha_finalizacion;
    String salon_entrenamiento;
    List<estudiantes>estudiantess;

    
    public grupo (String ruta,Map<String, Object> modulos,
    String Nombre,String fecha_inicio,String fecha_finalizacion,String salon_entrenamiento,List<estudiantes>estudiantess){
            
        this.ruta = ruta;
        this.modulos = modulos;
        this.Nombre = Nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_finalizacion = fecha_finalizacion;
        this.salon_entrenamiento = salon_entrenamiento;
        this.estudiantess=estudiantess;
    }    

    @Override
    public String toString() {
        StringBuilder concatenacion = new StringBuilder();
        concatenacion.append("Grupo: ").append(Nombre).append("\n")
                .append("Ruta: ").append(ruta).append("\n")
                .append("Fecha de inicio: ").append(fecha_inicio).append("\n")
                .append("Fecha de finalización: ").append(fecha_finalizacion).append("\n")
                .append("Aula de entrenamiento: ").append(salon_entrenamiento).append("\n")
                .append("Módulos: ").append(modulos).append("\n")
                .append("Estudiantes:\n")
                .append("\n");
        for (estudiantes est : estudiantess) {
            concatenacion.append("id: ").append(est.id).append("\n")
                    .append("nombre: ").append(est.nombre).append("\n")
                    .append("Apellidos: ").append(est.Apellidos).append("\n")
                    .append("Edad: ").append(est.Edad).append("\n")
                    .append("Direccion: ").append(est.Direccion).append("\n")
                    .append("Acudiente: ").append(est.Acudiente).append("\n")
                    .append("telefono: ").append(est.telefono).append("\n")
                    .append("Estado: ").append(est.Estado).append("\n")
                    .append("Riesgo: ").append(est.Riesgo).append("\n")
                    .append("modulosCursados: ").append(est.modulosCursados).append("\n")
                    .append("\n");
                    
        }
        return concatenacion.toString();
    }
    // es una clase que no depende de la principal para ser usada.
    public static class estudiantes{
        // el private static hace que el contador sea estatico por tanto se mantega uno y creciente.
        private static int contadorid = 1;
        
        int id ;
        String nombre;
        String Apellidos;
        int Edad;
        String Direccion;
        String Acudiente;
        int telefono;
        String Estado;
        String Riesgo;
        Map<String, Object> modulosCursados;
        
        
        public estudiantes (int id, String nombre,String Apellidos,int Edad,
        String Direccion,String Acudiente,int telefono,String Estado,String Riesgo,Map<String, Object> modulosCursados){

            this.id = id;
            this.nombre = nombre;
            this.Apellidos = Apellidos;
            this.Edad = Edad;
            this.Direccion = Direccion;
            this.Acudiente = Acudiente;
            this.telefono=telefono;
            this.Estado = Estado;
            this.Riesgo = Riesgo;
            this.modulosCursados=modulosCursados;
        } 

        @Override
        public String toString() {
            return "estudiantes{" + "id=" + id + ", nombre=" + nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad + ", Direccion=" + Direccion + ", Acudiente=" + Acudiente + ", telefono=" + telefono + ", Estado=" + Estado + ", Riesgo=" + Riesgo + ", modulosCursados=" + modulosCursados + '}';
        }
        
    
    }
    public static class Trainer {
        
        
        int idT ;
        String nombreT;
        String ApellidoT;
        String userT;
        String contraseñaT;
        int EdadT;
        int telefonoT;
        String RutaT;
        
        public Trainer (int idT,String nombreT,String ApellidoT,String userT,
        String contraseñaT,int EdadT,int telefonoT,String RutaT){

            this.idT =idT ;
            this.nombreT = nombreT;
            this.ApellidoT = ApellidoT;
            this.userT = userT;
            this.contraseñaT = contraseñaT;
            this.EdadT = EdadT;
            this.telefonoT=telefonoT;
            this.RutaT=RutaT;
        } 

        @Override
        public String toString() {
            StringBuilder concatenacionT = new StringBuilder();
            concatenacionT.append("Trainers:\n")
                .append("id: ").append(idT).append("\n")
                .append("Nombre: ").append(nombreT).append("\n")
                .append("Apellido: ").append(ApellidoT).append("\n")
                .append("Usuario: ").append(userT).append("\n")
                .append("Contraseña: ").append(contraseñaT).append("\n")
                .append("Edad: ").append(EdadT).append("\n")
                .append("Telefono: ").append(telefonoT).append("\n")
                .append("Rutas: ").append(RutaT).append("\n");
            
            return concatenacionT.toString();

          
        }
    }
    public static class coordinador {
        
        int idC ;
        String nombreC;
        String ApellidoC;
        int EdadC;
        String SedeC;

        public coordinador (int idC,String nombreC,String ApellidoC,int EdadC,String SedeC){

            this.idC = idC;
            this.nombreC = nombreC;
            this.ApellidoC = ApellidoC;
            this.EdadC = EdadC;
            this.SedeC = SedeC;
        } 

        @Override
        public String toString() {
            StringBuilder concatenacionC = new StringBuilder();
            concatenacionC.append("Trainers:\n")
                .append("id: ").append(idC).append("\n")
                .append("Nombre: ").append(nombreC).append("\n")
                .append("Apellido: ").append(ApellidoC).append("\n")
                .append("Usuario: ").append(EdadC).append("\n")
                .append("Contraseña: ").append(SedeC).append("\n");
            
            return concatenacionC.toString();

          
        }
    }
    public static class ingreso  {
        int idI ;
        String nombreI;
        String ApellidosI;
        int EdadI;
        String DireccionI;
        String AcudienteI;
        int telefonoI;
        String EstadoI;
        String RiesgoI;
        
        
        public ingreso (int idI,String nombre,String Apellidos,int Edad,
        String Direccion,String Acudiente,int telefono,String Estado){

            this.idI = idI;
            this.nombreI = nombre;
            this.ApellidosI = Apellidos;
            this.EdadI = Edad;
            this.DireccionI = Direccion;
            this.AcudienteI = Acudiente;
            this.telefonoI=telefono;
            this.EstadoI = Estado;
            
        } 

        @Override
        public String toString() {
           StringBuilder concatenacionIn = new StringBuilder();
           concatenacionIn.append("id: ").append(idI).append("\n")
                    .append("nombre: ").append(nombreI).append("\n")
                    .append("Apellidos: ").append(ApellidosI).append("\n")
                    .append("Edad: ").append(EdadI).append("\n")
                    .append("Direccion: ").append(DireccionI).append("\n")
                    .append("Acudiente: ").append(AcudienteI).append("\n")
                    .append("telefono: ").append(telefonoI).append("\n")
                    .append("Estado: ").append(EstadoI).append("\n")
                    .append("\n");
            
            return concatenacionIn.toString();

          
        }
    }
    
}

