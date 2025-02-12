
package conversion_campuslands;
import conversion_campuslands.grupo.Registro_de_Entrada;
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
        System.out.println("1. MODULO DE COORDINACION ACADEMICA");
        System.out.println("2. MODULO DE TRAINER.");
        System.out.println("3. MODULO DE REPORTE.");
        System.out.println("4. REGISTRAR ENTRADA.");
        System.out.println("5. Salir");
        System.out.println("_______________________");
    }
    public void menuCoordinador(){
        System.out.println("_______MENU_______");
        System.out.println("1. listar estudiantes");
        System.out.println("2. ingresar nuevos campers.");
        System.out.println("3. modulo de matriculas.");
        System.out.println("4. crear rutas academicas con los modulos.");
        System.out.println("5. asignar rutas de entrenamiento a los traniers");
        System.out.println("6. notas de modulos");
        System.out.println("7. consultar campers con riesgo alto.");
        System.out.println("8. actualizar datos de campers.");
        System.out.println("9. volver al menu principal.");
        System.out.println("_______________________");
    }
    public void menutrainer(){
        System.out.println("_______MENU_______");
        System.out.println("1. Mostrar horarios y ruta");
        System.out.println("2. Actualizar datos.");
        System.out.println("3. Salir");
        System.out.println("_______________________");
    }
    public void menuReportes(){
        System.out.println("_______MENU_______");
        System.out.println("1. listar campers inscritos");
        System.out.println("2. listar los campers que aprobaron el examen principal.");
        System.out.println("3. listar todos los entrenadores.");
        System.out.println("4. listar campers de bajo rendimiento");
        System.out.println("5. listar campers y trainers que tienen ruta de entrenamiento");
        System.out.println("6. mostrar cuantos campers perdieron y aprobaron cada uno de los modulos teniendo en "
                + "cuenta la ruta de entrenamiento y el entrenador encargado.");
        
        System.out.println("7. Salir");
        System.out.println("_______________________");
    }
    public void menuModificacionestrainer(){
        System.out.println("_______MENU_______");
        System.out.println("1. Nombre");
        System.out.println("2. Apellido.");
        System.out.println("3. Telefono.");
        System.out.println("4.  User");
        System.out.println("5. Contraseña");
        System.out.println("6. Edad");
        System.out.println("7. Finalizar");
        System.out.println("_______________________");
    }
    public void menuModificaciones(){
        System.out.println("_______MENU_______");
        System.out.println("1. modificar Nombre");
        System.out.println("2. modificar Apellido.");
        System.out.println("3. modificar edad .");
        System.out.println("4. modificar direccion");
        System.out.println("5. modificar acudiente");
        System.out.println("6. modificar numero de celular");
        System.out.println("7. modificar numero fijo");
        System.out.println("8. finalizar");
        System.out.println("_______________________");
    }
    public void menuModulos(){
        System.out.println("_______MENU_______");
        System.out.println("1. fundamentos de programacion");
        System.out.println("2. programacion web.");
        System.out.println("3. programacion formal.");
        System.out.println("4.  bases de datos");
        System.out.println("5. backend");
        System.out.println("6. Finalizar");
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
        estudiantesArray.add(new estudiantes("yurley", "botello", 17, "10-call 3", "ana", 300346789, "cursando", "bajo", new HashMap<>()));
        estudiantesArray.add(new estudiantes( "luis", "caicedo", 19, "13-call 6", "luis", 300728393, "cursando", "bajo", new HashMap<>()));
        estudiantesArray.add(new estudiantes("pablo", "contreras", 23, "10-call 4", "pedro", 312467832, "cursando", "bajo", new HashMap<>()));
        estudiantesArray.add(new estudiantes( "maria", "sandoval", 21, "11-call 6", "Maria", 316783426, "cursando", "bajo", new HashMap<>()));
        estudiantesArray.add(new estudiantes("camilo", "suarez", 18, "14-call 7", "camilo", 302426389, "cursando", "bajo", new HashMap<>()));
        estudiantesArray.add(new estudiantes( "sofia", "suarez", 19, "1-call 6", "sofia", 332758393, "cursando", "bajo", new HashMap<>()));
        
        
        
        ArrayList<grupo> grupoArray = new ArrayList<>();
        grupoArray.add(new grupo("nodeJS", modulos, "t1", "20-01-2024", "20-11-2025", "aula1", estudiantesArray.subList(0, 2)));
        grupoArray.add(new grupo("java", modulos, "t2", "10-02-2024", "10-11-2025", "aula2", estudiantesArray.subList(0, 2)));
        grupoArray.add(new grupo("NetCore", modulos, "t3", "01-01-2024", "14-12-2025", "aula3", estudiantesArray.subList(0, 2)));
       
        
        ArrayList<Trainer> TrainerArray = new ArrayList<>();
        TrainerArray.add( new Trainer(1, "pedro", "caceres", "pedro", "p123", 20, 32122312, "t1"));
        TrainerArray.add(new Trainer(2, "michael", "rodriguez", "michael", "m123", 27, 32122567, "t2"));
        TrainerArray.add(new Trainer(3, "orbin", "contreras", "orbin", "o123", 30, 321224562, "t3"));
        
        ArrayList<coordinador> coordinadorArray = new ArrayList<>();
        coordinadorArray.add(new coordinador(123, "stiven", "carvajal", 23, "tibu"));
     
        ArrayList<ingreso> ingresoArray = new ArrayList<>();
        ingresoArray.add( new ingreso(11,"jesus", "bustamante", 17, "23-cal13", "ingrid", 32416782,"progreso de ingreso"));

        ArrayList<Registro_de_Entrada> Registro_de_EntradaArray = new ArrayList<>();
        Registro_de_EntradaArray.add(new Registro_de_Entrada(234, "2024-08-15 16:50:39", "una tarea", "Inactiva"));
        Registro_de_EntradaArray.add(new Registro_de_Entrada(1, "2024-08-15 17:05:22", "nada", "Activa"));
      
        
        
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
                        System.out.println("___BIENVENIDO AL MODULO DE COORDINACCION_____");
                        campuslands.menuCoordinador();
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
                                System.out.println("______INGRESAR CAMPERS NUEVOS_____");
                                int idecita=0;
                                for (int i = 0; i < estudiantesArray.size(); i++) {
                                   estudiantes estudiante = estudiantesArray.get(i);
                                   idecita = estudiante.id = i + 2;  
                                    
                                }                          
                                String nameNEWCAMPER="";
                                String surnameNEWCAMPER="";
                                int ageNEWCAMPER=0;
                                String direNEWCAMPER="";
                                String acuNEWCAMPER="";
                                int numphoneNEWCAMPER=0;
                                String estadoNEWCAMPER="progreso de ingreso";
                                String riesgoNEWCAMPER="";
                                
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
                                    System.out.println("ingrese el numero de telefon del camper:");
                                        numphoneNEWCAMPER=scanner.nextInt();
                                     
                                    ingreso Ingreso = new ingreso(idecita,nameNEWCAMPER, surnameNEWCAMPER, ageNEWCAMPER, direNEWCAMPER,  acuNEWCAMPER, numphoneNEWCAMPER,estadoNEWCAMPER);
                                    ingresoArray.add(Ingreso);

                                    System.out.println(ingresoArray);
                                     
                                    
                                 break;
                            case 3:
                                   System.out.println("______MATRICULA MODULOS____");
                            break;
                            case 4:
                                 System.out.println("______CREAR RUTAS____");
                            break;
                            case 5:
                                 System.out.println("______ASIGNAR RUTAS TRAINERS____");
                            break;
                            case 6:
                                 System.out.println("______NOTAS MODULOS____");
                            break;
                            case 7:
                                 System.out.println("______LISTA CAMPERS RIESGO ALTO____");
                            break;
                            case 8:
                                 System.out.println("______ACTUALIZAR DATOS CAMPERS____");
                            break;
                            case 9:
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
                        System.out.println("___BIENVENIDO AL MODULO TRAINER_____");
                        campuslands.menutrainer();
                        int opccoor1=0;
                        System.out.println("Ingrese la opcion que desea ver:");
                        opccoor1=scanner.nextInt();
                        switch(opccoor1){
                            case 1:
                                  System.out.println("______RUTAS Y HORARIOS____");
                            break;
                            case 2:
                                  System.out.println("______ACTUALIZAR DATOS____");
                            break;
                            case 3:
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
                        System.out.println("___BIENVENIDO AL MODULO DE REPORTES_____");
                        campuslands.menuReportes();
                        int opccoor2=0;
                        System.out.println("Ingrese la opcion que desea ver:");
                        opccoor2=scanner.nextInt();
                        switch(opccoor2){
                            case 1:
                                   System.out.println("______CAMPERS INSCRITOS____");
                            break;
                            case 2:
                                   System.out.println("______CAMPERS APROBARON EXAMEN PRINCIPAL____");
                            break;
                            case 3:
                                   System.out.println("______LISTA DE TRAINERS____");
                            break;
                            case 4:
                                   System.out.println("______CAMPERS DE BAJO RENDIMIENTO____");
                            break;
                            case 5:
                                   System.out.println("______CAMPERS Y TRAINER CON RUTA DE ENTRENAMIENTO____");
                            break;
                            case 6:
                                   System.out.println("______CAMPERS APROBADOS Y CAMPERS DESAPROBADOS____");
                            break;
                            case 7:
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
                        System.out.println("_____REGISTRO DE ENTRADA CAMPERS_____");
                          bool3=false;
                    }
                   
                break;
                case 5:
                    System.out.println("Haz anbandonado la plataforma campuslands,Hasta la proxima. :)");
                    booleanito=false;
                    break;
            }
            
           
        }
    }
    
}
