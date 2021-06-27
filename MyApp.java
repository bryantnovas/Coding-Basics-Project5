public class MyApp {
    public static void main(String[] argv) {
        java.util.Scanner userinput;

        String helpString = """
            $ --help, -h
                displays this message

            USAGE
                $ <command> [<args>]

            EXAMPLES
                $ tv the-4400
                {
                    "id":39652,
                    "url":"https://www.tvmaze.com/shows/39652/the-4400"

                    ...
                }

                COMMANDS
                    wiki            returns wikipedia json string
                    zipcode         returns info on zipcode
                    tv, television  returns json info on a tv show
                    music           returns json info on a song
                """;

        outerLoop:
        while (true) {
            System.out.print("Command> ");
            userinput = new java.util.Scanner(System.in);
            String cmd = userinput.next();
            System.out.println("You selected " + cmd + ".");

            try {
                switch (cmd) {
                    case "zipcode":
                        int zip = userinput.nextInt();
                        System.out.println((new Zipcode(zip).get()));
                        break;
                    case "tv":
                    case "television":
                        String show = userinput.next();
                        System.out.println((new Television(show).get()));
                        break;
                    case "music":
                        String song = userinput.next();
                        System.out.println((new Music(song).get()));
                        break;
                    case "wiki":
                        String search = userinput.next();
                        System.out.println((new Wiki(search)).get());
                        break;
                    case "-h":
                    case "--help":
                        System.out.println(helpString);
                        break;
                    case "exit":
                        userinput.close();
                        break outerLoop;
                    default:
                        System.out.printf("%s is not a valid command. %n", cmd);
                }
            } catch (Exception e) {
                System.out.println(e);
                continue;
            }
        }
    }
}