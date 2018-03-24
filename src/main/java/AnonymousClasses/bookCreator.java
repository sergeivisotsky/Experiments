package AnonymousClasses;

public class bookCreator {

    public static void main(String[] args) {
        PaperCreator creatorObject = new PaperCreator() {
            @Override
            public void scratchPaper() {
                System.out.println("Paper was scratched!");
            }

            @Override
            public void createPaper() {
                System.out.println("Paper was created!");
            }

            @Override
            public void sellBook() {
                System.out.println("Book was sold!");
            }

            @Override
            public void burnBook() {
                System.out.println("Book was burnt! :(");
            }
        };

        creatorObject.scratchPaper();
//        creatorObject.createPaper();
//        creatorObject.sellBook();
//        creatorObject.burnBook();
    }
}
