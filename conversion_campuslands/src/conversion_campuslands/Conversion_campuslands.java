
package conversion_campuslands;
import conversion_campuslands.grupo.ingreso;
import conversion_campuslands.grupo.coordinador;
import conversion_campuslands.grupo.estudiantes;
import conversion_campuslands.grupo.Trainer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Conversion_campuslands {

    public void menuPlataforma(){
        System.out.println("_______PLATAFORMA_CAMPUSLANDS_______");
        System.out.println("1. lISTAR");
        System.out.println("2. AGREGAR.");
        System.out.println("3. ACTUALIZAR.");
        System.out.println("4. ELIMINAR.");
        System.out.println("5. AGREGAR NOTAS");
        System.out.println("6. SALIR");
        System.out.println("_______________________");
    }
   
    public void menuOPC(){
        System.out.println("_______MENU_______");
        System.out.println("1. CAMPER");
        System.out.println("2. TRAINER.");
        System.out.println("3. COORDINADOR.");
        System.out.println("4. SALIR.");
        System.out.println("_______________________");
    }
   
    public static void main(String[] args) {
      
        Map<String,Object>modulos= new HashMap<>();
        modulos.put("fundamentos de programacion", List.of("introduccion a la algoritmia", "PSeint", "Python"));
        modulos.put("programacion web", List.of("HTML", "CSS", "booststrap"));
        modulos.put("programacion formal", "C#");
        modulos.put("bases de datos", List.of("MongoDB", "Mysql"));
        modulos.put("backend", List.of("nodeJS", "Spring Boot"));
        
        
        ArrayList<estudiantes> estudiantesArray = new ArrayList<>();
        estudiantesArray.add(new estudiantes(1,"yurley", "botello", 17, "10-call 3", "ana", 300346789, "cursando", "bajo", new HashMap<>()));
        estudiantesArray.add(new estudiantes( 2,"luis", "caicedo", 19, "13-call 6", "luis", 300728393, "cursando", "bajo", new HashMap<>()));
        estudiantesArray.add(new estudiantes(3,"pablo", "contreras", 23, "10-call 4", "pedro", 312467832, "cursando", "bajo", new HashMap<>()));
        estudiantesArray.add(new estudiantes( 4,"maria", "sandoval", 21, "11-call 6", "Maria", 316783426, "cursando", "bajo", new HashMap<>()));
        estudiantesArray.add(new estudiantes(5,"camilo", "suarez", 18, "14-call 7", "camilo", 302426389, "cursando", "bajo", new HashMap<>()));
        estudiantesArray.add(new estudiantes( 6,"sofia", "suarez", 19, "1-call 6", "sofia", 332758393, "cursando", "bajo", new HashMap<>()));
        
        
        
        ArrayList<grupo> grupoArray = new ArrayList<>();
        grupoArray.add(new grupo("nodeJS", modulos, "t1", "20-01-2024", "20-11-2025", "aula1", estudiantesArray.subList(0, 2)));
        grupoArray.add(new grupo("java", modulos, "t2", "10-02-2024", "10-11-2025", "aula2", estudiantesArray.subList(0, 2)));
        grupoArray.add(new grupo("NetCore", modulos, "t3", "01-01-2024", "14-12-2025", "aula3", estudiantesArray.subList(0, 2)));
       
        
        ArrayList<Trainer> TrainerArray = new ArrayList<>();
        TrainerArray.add( new Trainer( 1,"pedro", "caceres", "pedro", "p123", 20, 32122312, "t1"));
        TrainerArray.add(new Trainer( 2,"michael", "rodriguez", "michael", "m123", 27, 32122567, "t2"));
        TrainerArray.add(new Trainer( 3,"orbin", "contreras", "orbin", "o123", 30, 321224562, "t3"));
        
        ArrayList<coordinador> coordinadorArray = new ArrayList<>();
        coordinadorArray.add(new coordinador(1,"stiven", "carvajal", 23, "tibu"));
     
        ArrayList<ingreso> ingresoArray = new ArrayList<>();
        ingresoArray.add( new ingreso(11,"jesus", "bustamante", 17, "23-cal13", "ingrid", 32416782,"progreso de ingreso"));

        
      
        
        
        boolean booleanito=true;
        while (booleanito){
            // se debe crear una instancia para la clase principal para asi poder llamar los metodos.
            Conversion_campuslands campuslands = new Conversion_campuslands();
            campuslands.menuPlataforma();
            Scanner scanner = new Scanner(System.in);
            int opcprinci=0;
            System.out.println("Ingrese la opcion que desea ver:");
            opcprinci=scanner.nextInt();
            switch(opcprinci){
                case 1:
                    boolean bool=true;
                    while(bool){
                        System.out.println("_______MENU_______");
                        System.out.println("1. CAMPER");
                        System.out.println("2. TRAINER.");
                        System.out.println("3. COORDINADOR.");
                        System.out.println("4. CAMPER PROGRESO INGRESO.");
                        System.out.println("5. SALIR.");
                        System.out.println("_______________________");
                        int opccoor=0;
                        System.out.println("Ingrese la opcion que desea ver:");
                        opccoor=scanner.nextInt();
                        switch(opccoor){
                            case 1:
                                System.out.println("______LISTA DE CAMPERS_____");
                                for (estudiantes i: estudiantesArray) {
                                    StringBuilder concatenacionESTU = new StringBuilder();
                                    concatenacionESTU.append("id: ").append(i.id).append("\n")
                                    .append("nombre: ").append(i.nombre).append("\n")
                                    .append("Apellidos: ").append(i.Apellidos).append("\n")
                                    .append("Edad: ").append(i.Edad).append("\n")
                                    .append("Direccion: ").append(i.Direccion).append("\n")
                                    .append("Acudiente: ").append(i.Acudiente).append("\n")
                                    .append("telefono: ").append(i.telefono).append("\n")
                                    .append("Estado: ").append(i.Estado).append("\n")
                                    .append("Riesgo: ").append(i.Riesgo).append("\n")
                                    .append("modulosCursados: ").append(i.modulosCursados).append("\n")
                                    .append("\n");
                                    
                                    System.out.println(concatenacionESTU);
                                }
                            break;
                            case 2:
                                System.out.println("______LISTA TRAINERS_____");
                                for (Trainer a: TrainerArray) {
                                    StringBuilder concatenacionT = new StringBuilder();
                                    concatenacionT.append("id: ").append(a.idT).append("\n")
                                        .append("Nombre: ").append(a.nombreT).append("\n")
                                        .append("Apellido: ").append(a.ApellidoT).append("\n")
                                        .append("Usuario: ").append(a.userT).append("\n")
                                        .append("Contraseña: ").append(a.contraseñaT).append("\n")
                                        .append("Edad: ").append(a.EdadT).append("\n")
                                        .append("Telefono: ").append(a.telefonoT).append("\n")
                                        .append("Rutas: ").append(a.RutaT).append("\n");

                                    System.out.println(concatenacionT);
                                }       
                            break;
                            case 3:
                                System.out.println("______LISTA COORDINADORES_____");
                                System.out.println("");
                                for (coordinador e: coordinadorArray) {
                                    StringBuilder concatenacionC = new StringBuilder();
                                    concatenacionC.append("id: ").append(e.idC).append("\n")
                                        .append("Nombre: ").append(e.nombreC).append("\n")
                                        .append("Apellido: ").append(e.ApellidoC).append("\n")
                                        .append("Edad: ").append(e.EdadC).append("\n")
                                        .append("Sede: ").append(e.SedeC).append("\n");

                                    System.out.println(concatenacionC);
                                }
                            break;
                            case 4:
                                System.out.println("______LISTA DE CAMPERS EN PROCESO DE INGRESO_____");
                                for (ingreso in: ingresoArray) {
                                    StringBuilder concatenacionIn = new StringBuilder();
                                    concatenacionIn.append("id: ").append(in.idI).append("\n")
                                             .append("nombre: ").append(in.nombreI).append("\n")
                                             .append("Apellidos: ").append(in.ApellidosI).append("\n")
                                             .append("Edad: ").append(in.EdadI).append("\n")
                                             .append("Direccion: ").append(in.DireccionI).append("\n")
                                             .append("Acudiente: ").append(in.AcudienteI).append("\n")
                                             .append("telefono: ").append(in.telefonoI).append("\n")
                                             .append("Estado: ").append(in.EstadoI).append("\n")
                                             .append("\n");
                                    System.out.println(concatenacionIn);
                                }
                            break;
                                
                            case 5:
                                System.out.println("Regresando...");
                                scanner.nextLine();
                                bool=false;
                            break; 
                        }
                         
                    }
                break;
                case 2:
                    boolean bool1=true;
                    while(bool1){
                        
                        campuslands.menuOPC();
                        int opccoor=0;
                        System.out.println("Ingrese la opcion que desea ver:");
                        opccoor=scanner.nextInt();
                        switch(opccoor){
                            case 1:
                                System.out.println("______INGRESAR CAMPERS NUEVOS_____");
                                   
                                int ideee=0;
                                String nameNEWCAMPER="";
                                String surnameNEWCAMPER="";
                                int ageNEWCAMPER=0;
                                String direNEWCAMPER="";
                                String acuNEWCAMPER="";
                                int numphoneNEWCAMPER=0;
                                String estadoNEWCAMPER="progreso de ingreso";
                                String riesgoNEWCAMPER="";
                                
                                
                                System.out.println("ingrese la id :");
                                ideee=scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("ingrese la edad del camper:");
                                    ageNEWCAMPER=scanner.nextInt();
                                     scanner.nextLine();
                                System.out.println("ingrese el nombre del camper:");
                                    nameNEWCAMPER=scanner.nextLine();
                                System.out.println("ingrese el apellido del camper:");
                                    surnameNEWCAMPER=scanner.nextLine();
                                System.out.println("ingresela direccion del camper:");
                                    direNEWCAMPER=scanner.nextLine();
                                System.out.println("ingrese el nombre del acuduiente del camper:");
                                    acuNEWCAMPER=scanner.nextLine();
                                System.out.println("ingrese el numero de telefono del camper:");
                                    numphoneNEWCAMPER=scanner.nextInt();

                                ingreso Ingreso = new ingreso(ideee,nameNEWCAMPER, surnameNEWCAMPER, ageNEWCAMPER, direNEWCAMPER,  acuNEWCAMPER, numphoneNEWCAMPER,estadoNEWCAMPER);
                                ingresoArray.add(Ingreso);

                                 System.out.println("El Camper se agrego correctamente..");

                            
                                
                            break;
                            case 2:
                                System.out.println("______INGRESAR TRAINER NUEVOS_____");
                              
                                int idee=0;
                                String nameNEWTRAINER="";
                                String surnameNEWTRAINER="";
                                String passNEWTRAINER="";
                                String userNEWTRAINER="";
                                int numphoneNEWTRAINER=0;
                                int ageNEWTRAINER=0;
                                String grupoNEWTRAINER="";
                             
                                System.out.println("ingrese la id :");
                                idee=scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("ingrese el nombre del trainerr:");
                                scanner.nextLine();
                                nameNEWTRAINER=scanner.nextLine();
                                System.out.println("ingrese el apellido del trainer:");
                                surnameNEWTRAINER=scanner.nextLine();
                                System.out.println("ingrese la contraseña del trainer:");
                                passNEWTRAINER=scanner.nextLine();
                                System.out.println("ingrese el usuario del trainer:");
                                userNEWTRAINER=scanner.nextLine();
                                System.out.println("ingrese el numero de telefono del trainer:");
                                numphoneNEWTRAINER=scanner.nextInt();
                                System.out.println("ingrese la edad del trainers:");
                                ageNEWTRAINER=scanner.nextInt();
                                System.out.println("ingrese el grupo :");
                                grupoNEWTRAINER=scanner.nextLine();
                                System.out.println("");
                                Trainer trainer = new Trainer( idee, nameNEWTRAINER, surnameNEWTRAINER, userNEWTRAINER, passNEWTRAINER, ageNEWTRAINER, numphoneNEWTRAINER, grupoNEWTRAINER);
                                TrainerArray.add(trainer);

                                System.out.println("El Trainer se agrego correctamente..");
                                
                            break;
                            case 3:
                                 System.out.println("______INGRESAR COORDINADOR NUEVOS_____");
                                 
                                int ide=0;
                                String nameNEWCOORDI="";
                                String surnameNEWCOORDI="";
                                int ageNEWCOORDI=0;
                                String sedeNEWCOORDI="";
                             
                                System.out.println("ingrese la id del coordinador:");
                                ide=scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("ingrese el nombre del coordinador:");
                                scanner.nextLine();
                                nameNEWCOORDI=scanner.nextLine();
                                System.out.println("ingrese el apellido del coordinador:");
                                surnameNEWCOORDI=scanner.nextLine();
                                System.out.println("ingrese la edad del coordinador:");
                                ageNEWCOORDI=scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("ingrese la sede  del coordinador:");
                                sedeNEWCOORDI=scanner.nextLine();
                                System.out.println("");
                                
                                coordinador Coordinador = new coordinador(ide, nameNEWCOORDI, surnameNEWCOORDI, ageNEWCOORDI, sedeNEWCOORDI);
                                coordinadorArray.add(Coordinador);

                                System.out.println("El coordinador se agrego correctamente.."); 
                            break;
                            case 4:
                                System.out.println("Regresando...");
                                scanner.nextLine();
                                bool1=false;
                            break; 
                        }
                    }   
                break;
                case 3:
                    boolean bool2=true;
                    while(bool2){
                       campuslands.menuOPC();
                       
                        int opccoor2=0;
                        System.out.println("Ingrese la opcion que desea ver:");
                        opccoor2=scanner.nextInt();
                        switch(opccoor2){
                            case 1:
                                System.out.println("______ACTUALIZAR CAMPER____");
                                    
                                System.out.println("Ingrese La id del camper a actualizar");
                                int id ;
                                id=scanner.nextInt();
                                estudiantes camperActualizar=null;
                                for (estudiantes estu : estudiantesArray) {
                                    if (estu.id == id) {
                                        camperActualizar = estu;
                                        break;
                                    }
                                }
                                System.out.println("_____Actualizar______");
                                System.out.println("1. Nombre");
                                System.out.println("2. Edad");
                                System.out.println("3. Acudiente");
                                System.out.println("4. Direccion");
                                System.out.println("5. Estado");
                                System.out.println("6. Volver a la principal");
                                System.out.println("-----------------------");
                                int campactualizar;
                                campactualizar=scanner.nextInt();
                                switch(campactualizar){
                                    case 1:
                                        scanner.nextLine(); 
                                        System.out.println("Ingrese el nombre nuevo del camper:");
                                        String newNombre = scanner.nextLine();
                                        camperActualizar.nombre = newNombre;
                                        System.out.println("Nombre actualizado Correctamente ");
                                        
                                    break;
                                    case 2:
                                        System.out.println("Ingrese la nueva edad del Camper:");
                                        int newEdad = scanner.nextInt();
                                        camperActualizar.Edad = newEdad;
                                        System.out.println("Edad actualizada Correctamente ");
                                        
                                    break;
                                    case 3:
                                        System.out.println("Ingrese el nombre del nuevo acudiente del Camper:");
                                        String newnameAcu = scanner.nextLine();
                                        camperActualizar.Acudiente = newnameAcu;
                                        System.out.println("Acudiente actualizada Correctamente");
                                       
                                    break;
                                    case 4:
                                        System.out.println("Ingrese la nueva direccion del Camper:");
                                        String newdirecc = scanner.nextLine();
                                        camperActualizar.Direccion = newdirecc;
                                        System.out.println("Direccion actualizada Correctamente");
                                        
                                    break;

                                    case 5:
                                        System.out.println("Ingrese el nuevo estado del Camper:");
                                        String newEstado = scanner.nextLine();
                                        camperActualizar.Estado = newEstado;
                                        System.out.println("Estado actualizada Correctamente: ");
                                 
                                    break;

                                    case 6:
                                        System.out.println("Regresando...");
                                    break;

                                }
                   
                            break;
                            case 2:
                                System.out.println("______ACTUALIZAR TRAINER____");

                                    
                                System.out.println("Ingrese La id del Trainer actualizar");
                                int id1 ;
                                id1=scanner.nextInt();
                                Trainer trainerActualizar=null;
                                for (Trainer trai : TrainerArray) {
                                    if (trai.idT == id1) {
                                        trainerActualizar = trai;
                                        break;
                                    }
                                }
                                System.out.println("_______MENU_______");
                                System.out.println("1. Nombre");
                                System.out.println("2. Telefono.");
                                System.out.println("3. User");
                                System.out.println("4. Contraseña");
                                System.out.println("5. Edad");
                                System.out.println("6. Finalizar");
                                System.out.println("_______________________");
                                int trainctualizar;
                                trainctualizar=scanner.nextInt();
                                switch(trainctualizar){
                                    case 1:
                                        scanner.nextLine(); 
                                        System.out.println("Ingrese el nombre nuevo del camper:");
                                        String newNombre = scanner.nextLine();
                                        trainerActualizar.nombreT = newNombre;
                                        System.out.println("Nombre actualizado Correctamente ");
                                        
                                    break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo numero de telefono:");
                                        int newtelefono = scanner.nextInt();
                                        trainerActualizar.telefonoT = newtelefono;
                                        System.out.println("Telefono actualizada Correctamente ");
                                        
                                    break;
                                    case 3:
                                        System.out.println("Ingrese el  nuevo usuario :");
                                        String newuser = scanner.nextLine();
                                        trainerActualizar.userT = newuser;
                                        System.out.println("Usuario actualizada Correctamente");
                                       
                                    break;
                                    case 4:
                                        System.out.println("Ingrese la nueva Contraseña :");
                                        String newcontra = scanner.nextLine();
                                        trainerActualizar.contraseñaT = newcontra;
                                        System.out.println("Contraseña actualizada Correctamente");
                                        
                                    break;
                                    case 5:
                                        System.out.println("Ingrese la nueva edad del trainer:");
                                        int newEdadT = scanner.nextInt();
                                        trainerActualizar.EdadT = newEdadT;
                                        System.out.println("Edad actualizada Correctamente ");
                                 
                                    break;
                                    case 6:
                                        System.out.println("Regresando...");
                                    break;

                                }
                            break;
                            case 3:
                                System.out.println("______ACTUALIZAR COORDINADOR____");
                                   
                                System.out.println("Ingrese La id del Coordinar actualizar");
                                int id2 ;
                                id2=scanner.nextInt();
                                coordinador CoordinadorActualizar=null;
                                for (coordinador coo : coordinadorArray) {
                                    if (coo.idC == id2) {
                                        CoordinadorActualizar = coo;
                                        break;
                                    }
                                }
                                System.out.println("_______MENU_______");
                                System.out.println("1. Nombre");
                                System.out.println("2. Sede.");
                                System.out.println("3. Edad");
                                System.out.println("4. Finalizar");
                                System.out.println("_______________________");
                                int coordinactualizar;
                                coordinactualizar=scanner.nextInt();
                                switch(coordinactualizar){
                                    case 1:
                                        scanner.nextLine(); 
                                        System.out.println("Ingrese el nombre nuevo del coordinador:");
                                        String newNombre = scanner.nextLine();
                                        CoordinadorActualizar.nombreC = newNombre;
                                        System.out.println("Nombre actualizado Correctamente ");
                                        
                                    break;
                                    case 2:
                                        System.out.println("Ingresela nueva sede del coordinador:");
                                        String newSedeC = scanner.nextLine();
                                        CoordinadorActualizar.SedeC = newSedeC;
                                        System.out.println("Telefono actualizada Correctamente ");
                                        
                                    break;
                                    case 3:
                                        System.out.println("Ingrese la edad del coordinador :");
                                        int newEdadC = scanner.nextInt();
                                        CoordinadorActualizar.EdadC = newEdadC;
                                        System.out.println("Edad actualizada Correctamente");
                                       
                                    break;
                                    case 4:
                                        System.out.println("Regresando...");
                                    break;
                                }
                            break;
                            case 4:
                                System.out.println("Regresando...");
                                scanner.nextLine();
                                bool2=false;
                            break;
                        }
                    }
                break;
                case 4:
                    boolean bool3=true;
                    while(bool3){
                          campuslands.menuOPC();
                          int opccoor2=0;
                        System.out.println("Ingrese la opcion que desea ver:");
                        opccoor2=scanner.nextInt();
                        switch(opccoor2){
                            case 1:
                                System.out.println("______ELIMINAR CAMPER____");

                                System.out.println("Ingrese la id del camper que desea expulsar:");
                                int idecita ;
                                idecita=scanner.nextInt();

                                for (estudiantes campercito : estudiantesArray) {
                                    if (campercito.id == idecita) {
                                        estudiantesArray.remove(campercito);
                                        break;
                                    }
                                }
                            break;
                            case 2:
                                System.out.println("______ELIMINAR TRAINER____");
                                System.out.println("Ingrese la id del Trainer que desea eliminar:");
                                int idecita1 ;
                                idecita1=scanner.nextInt();

                                for (Trainer trainercito : TrainerArray) {
                                    if (trainercito.idT == idecita1) {
                                        TrainerArray.remove(trainercito);
                                        break;
                                    }
                                    
                                }
                            break;
                            case 3:
                                System.out.println("______ELIMINAR COORDINADOR____");
                                System.out.println("Ingrese la id del coordinador que desea eliminar:");
                                int idecita2 ;
                                idecita2=scanner.nextInt();

                                for (coordinador COORDI : coordinadorArray) {
                                    if (COORDI.idC == idecita2) {
                                        coordinadorArray.remove(COORDI);
                                        break;
                                    }
                                    
                                }
                            break;
                            case 4:
                                System.out.println("Regresando...");
                                scanner.nextLine();
                                bool3=false;
                            break;
       
                        }
                    }
                break;
                case 5:
                    
                    boolean repetir=true;
                    while(repetir){
                        
                        System.out.println("-------AGREGAR NOTA CAMPERS INGRESO------");
                        System.out.println("ingrese la id del camper a agregar notas:");
                        int idCam = scanner.nextInt();
                        boolean camperEncontrado = false;
                        for (ingreso ing : ingresoArray) {
                            camperEncontrado = true;
                            if (ing.idI == idCam) {
                                repetir = false;
                                double notaTeorica = 0;
                                double notaPractica = 0;
                                double notaTrabajos = 0;
                                double notafinal = 0;
                                String newEstado;

                                System.out.println("Ingrese la nota teórica:");
                                notaTeorica = scanner.nextDouble();

                                System.out.println("Ingrese la nota práctica:");
                                notaPractica = scanner.nextDouble();

                                System.out.println("Ingrese la nota de trabajos:");
                                notaTrabajos = scanner.nextDouble();

                                notafinal = notaTeorica * 0.3 + notaPractica * 0.6 + notaTrabajos * 0.1;

                                if (notafinal >= 60) {
                                    newEstado = "Aprobado";
                                    estudiantes nuevoEstudiante = new estudiantes(ing.idI, ing.nombreI, ing.ApellidosI, ing.EdadI, ing.DireccionI,
                                        ing.AcudienteI, ing.telefonoI, newEstado, "bajo", new HashMap<>());
                                    estudiantesArray.add(nuevoEstudiante);

                                    ingresoArray.remove(ing);
                                    break;
                                }
                            } 
                        }
                        if (camperEncontrado == false) {
                            System.out.println("Camper no encontrado");
                        }
                    }
                      
                break;
                case 6:
                    System.out.println("Haz anbandonado la plataforma campuslands,Hasta la proxima. :)");
                    booleanito=false;
                break;
            }
           
        }
    }
    
}
