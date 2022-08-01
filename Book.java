
   
            public class Book{
                String title;
                String author;

                public Book (String t) {
                        title = t;
                        author = "작자몰루?";
                }

                public Book(String t, String a) {
                    title = t;
                    author = a;
                        
                }


                    
                public  static  void main (String[] args) {
                    Book loveandpeice = new Book("어린왕자","생텍쥐페리");
                    Book koreabook = new Book("춘향전");
                
                    System.out.println(loveandpeice.title +" "+ loveandpeice.author);
                    System.out.println(koreabook.title+" "+koreabook.author);
                    
                }

            }



        


    
            
        