import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main2 {
    private Library library =null;
    private CSVCoder<Book> booksCoder=null;// esto es de la clase de hoy
    private final String FILE_PATH="data/Books.csv";

    //para guardar el objeto libros

    public Main2(){
        //esto es para el save el file_path
       
        booksCoder = new CSVCoder<Book>(';') { // ; ES QUE CADA DATO  VA ESTAR SEPARADO POR ;
            //codificar libro}
            @Override
            public String[] encode(Book book){

            return new String[]{

                //aca va a llegar los libros quedatos quiero que guarde ahi que tener los get y los sets
                book.getAuthor(),
                book.gettitle(),
                String.valueOf(book.getId()),// esto es para enteros
                String.valueOf(book.getpublicationYear()),
                String.valueOf(book.getnumberOfPages())
            


            };
            

            };
            @Override
            public Book decode(String[] values) {
                //tengo que ponerlos en el mismo orden que arriba
                var author=values[0];
                var title= values[1];
                var id= Integer.parseInt(values[2]);//esas posiciones me las toma del Books.csv
                var publicationYear=Integer.parseInt(values[3]);
                var numberOfPages = Integer.parseInt(values[4]);



                return new Book(author, title, id, publicationYear, numberOfPages );//para volverlos de clase libro ya va a saber como codificar un libro  para meterlos en array list
            };
            
        };
    }

        public void loadInfo(){
            List<Book> books= new ArrayList<>();
            try{
                booksCoder.readFromFile(FILE_PATH, books);// ese es el archivo que voy aguardar llamo la posicion 
                
                library=new Library();// para que no se dupliquen las bibliotecas
                Console.writeLine("lista de personas");


                
            for (Book book: books ) {
                Console.writeLine(book.getId()+ ""+ book.getAuthor()+" "+ book.getAuthor());
                
            }
            Console.writeLine();
        }

            catch(IOException e){
                System.out.println("error al intentar leer el archivo");
            }
        }
        public void saveInfo(){

            try{
            booksCoder.writeToFile(FILE_PATH, library.getAllBooks());

        }catch (IOException e){
            Console.writeLine("error al intentar guardar el archivo");
        }
    

        
        }
    public void addBook(){
        var  id=0;
        var tittle="";
        var author="";
        var publicationYear=0;
        var numberOfPages=0;
        var book= (Book) null;

        Console.writeLine("ingrese el id del libro");
        id = Integer.parseInt(Console.readLine());//para mirar que no es repetido

        if (library.getBook(id) !=null) {
            Console.writeLine("ERROR el id %d ya existe",id);
            
        }else{
            Console.writeLine("ingrese el id del libro");
            tittle=Console.readLine();
            Console.writeLine("ingrese el author del libro");
            author=Console.readLine();
            book=new Book(author, tittle, id, numberOfPages, publicationYear);
            library.addBook(book);
            Console.writeLine("el libro ha sido adicionado con exito");


        }
    }
}