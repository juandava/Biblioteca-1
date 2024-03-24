import java.util.List;

public class Main {

    public static void main(String [] args) {
        Library library= new Library();
        Main2 main= new Main2();
        
       
      
      


            int option = 0;
            do{
                Console.writeLine("... MENU PRINCIPAL...");
                Console.writeLine("------------------------");
                Console.writeLine("1. Agregar un libro");
                Console.writeLine("2. Prestar un libro");
                Console.writeLine("3. Devolver un libro");
                Console.writeLine("4. Mostrar todos los libros disponibles");
                Console.writeLine("5. Cargar informacion");
                Console.writeLine("6. Guardar informacion");
                Console.writeLine("8. Salir");
                Console.writeLine("------------------------");
                Console.writeLine("Ingrese una opción y presione [ENTER]");
                option = Integer.parseInt(Console.readLine());

                switch (option) {
                    case 1: {
                        Console.writeLine("escriba el nombre del libro");
                        String title=Console.readLine();
               
                        Console.writeLine("escriba el nombre del autor");
                        String author=Console.readLine();
               
                        Console.writeLine("escriba el id del libro");
                        int id=(Integer.parseInt(Console.readLine()));
               
                        Console.writeLine("escriba el año de publicacion del libro");
                        int publicationYear=(Integer.parseInt(Console.readLine()));
               
                        Console.writeLine("numero de paginas del libro");
                        int numberOfPages=(Integer.parseInt(Console.readLine()));

                        
               
                        Book book = new Book().CreateBook(title, author, id, publicationYear, numberOfPages);
                      library.addBook(book);
                      
                      

                      break;
                    }
                    case 2:{
                        Console.writeLine("Qué libro desea prestar de la biblioteca? Escriba el ID:");
                        int idToRemove = Integer.parseInt(Console.readLine());
                    
                        Book bookToBorrow = library.getBook(idToRemove);
                        if (bookToBorrow != null) {
                            boolean removed = library.borrowBook(idToRemove);
                            if (removed) {
                                Console.writeLine("El libro ha sido prestado y eliminado de la biblioteca.");
                            } else {
                                Console.writeLine("El libro no se encontró en la biblioteca.");
                            }
                        } else {
                            Console.writeLine("El libro no se encontró en la biblioteca.");
                        }
                        break;
                    }
            
                        
                    case 3:{
                        Console.writeLine("Que libro desea devolver a la biblioteca ");
                        break;

                    }
                    
                    case 4:{

                        Book agg = new Book().CreateBook("Cien años de soledad", "Gabriel Garcia Marquez", 100, 1967, 100);
                        library.addBook(agg);
                        Book agg1 = new Book().CreateBook("El principito", "Saints", 0002, 1940, 1020);
                        library.addBook(agg1);
                    
                        
                        List<Book> allBooks = library.getAllBooks();
    


                        Console.writeLine("los libros disponibles son");
                      for (Book book : allBooks) {
                        Console.writeLine("Título: " + book.gettitle());
                        Console.writeLine("Autor: " + book.getauthor());
                        Console.writeLine("ID: " + book.getId());
                        Console.writeLine("Año de publicación: " + book.getpublicationYear());
                        Console.writeLine("Número de páginas: " + book.getnumberOfPages());
                        Console.writeLine(); // Línea en blanco para separar los libros
                    }
                    break;
                }

                    case 5:{
                        main.loadInfo();

                        break;
                        

                    }
                    case 6:{
                        main.saveInfo();

                        break;
                    }case 7:{
                        
                    }
                
            

                        
                       
                       

                  
                       
                  


                    

                        
        

                       
                
                    default:
                        break;
                }


        
    
    
            }
            while (option != 8);
        }
        
    



      

        

        public void displayMenu(){

        }
            
        

   

    }
