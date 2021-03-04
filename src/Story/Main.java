package Story;


public class Main {
    private String phrase = "The beginning of the story";

    public static void main(String[] args) {

        Main main = new Main();
        Start start = main.new Start();

        Miga miga = new Miga("Miga");
        Julio julio = new Julio("Julio");
        Neznaika neznaika = new Neznaika("Neznaika");
        Goat goat = new Goat("Goat");
        Spruts spruts = new Spruts("Spruts", 2000);
        NewspaperOwners newspaperOwners = new NewspaperOwners("NewspaperOwners", 500, 1500);
        Workers workers = new Workers("Workers", 5, 1, CharacterStatus.WORKING.getStatus());
        // Анонимный класс
        Scooperfield scooperfield = new Scooperfield("Scooperfield", 1000, 0, 0) {
            @Override
            public void doSmth() {
                System.out.println("Scooperfield ran aground. He has " + getMoney() + " fertings");
            }
        };

        Barge barge = new Barge("Barge", 100, 100, 10);
        PastaFactory pastaFactory = new PastaFactory("PastaFactory", 0, null);
        Shop shop = new Shop("Shop", (short) 5);


        boolean nameCheck = miga.getName() == null | julio.getName() == null | neznaika.getName() == null | goat.getName() == null | spruts.getName() == null | newspaperOwners.getName() == null | workers.getName() == null | scooperfield.getName() == null | barge.getName() == null | pastaFactory.getName() == null | shop.getName() == null;
        boolean moneyCheck = spruts.getMoney() == 0 | newspaperOwners.getMoney() == 0 | workers.getMoney() == 0 | scooperfield.getMoney() == 0 | barge.getMoney() == 0;

        if (nameCheck) {
            try {
                throw new NameException("The name value is 'null'");
            } catch (NameException e) {
                System.err.println("Incorrect name. Please change the name");
                e.printStackTrace();
                System.exit(0);
            }
        } else {
            System.out.println("Correct names");
        }

        if (moneyCheck) {
            try {
                throw new MoneyException("The money value is '0'");
            } catch (MoneyException ex) {
                System.err.println("Someone has no money. Please change the value of money");
                ex.printStackTrace();
                System.exit(0);
            }
        } else {
            System.out.println("Correct money values");
        }

        start.startPhrase();
        float initialBalance = scooperfield.getMoney();
        System.out.println(ImageObjects.objectScene());
        neznaika.appear();
        goat.appear();
        neznaika.meAbleToGoDown();  // Незнайка и Козлик спускаются по верёвке
        goat.meAbleToGoDown();
        spruts.appear();
        newspaperOwners.appear();
        scooperfield.buyStocks(barge.getNumberOfStocks(), barge.getCostOfStocks());  // Покупка акций Скуперфильдом
        barge.setMoney(barge.getMoney() + scooperfield.getResCost());
        barge.setNumberOfStocks(barge.getNumberOfStocks() - scooperfield.getRandNum());
        miga.appear();
        julio.appear();
        miga.meAbleToRun();
        julio.meAbleToRun();
        spruts.newspaperBribery(newspaperOwners.getCostOfBribery());
        newspaperOwners.setMoney(newspaperOwners.getMoney() + (int) newspaperOwners.getCostOfBribery());
        for (int day = 2 + (int) (Math.random() * ((5 - 2) + 1)); day >= 0; day--) {                  // рандомное число дней
            System.out.println("NewspaperOwners don't print about the escape of Migi and Julio for " + day + " days");
            if (day == 0) {
                System.out.println("They told people about the escape!");
            }
        }
        if (!Character.isNeedStocks()) {
            System.out.println("Nobody wants stocks");
            scooperfield.setNumberOfStocks(0);
            System.out.println("Scooperfield throws out stocks. He has " + scooperfield.getNumberOfStocks() + " stocks");
        }
        float percentage = scooperfield.getMoney() / initialBalance;
        if (percentage < 0.2) {
            scooperfield.doSmth();
            System.out.println();        //
        }
        workers.setSalary(scooperfield.salaryReduction(workers.getSalary()));
        System.out.println(workers.toString());
        pastaFactory.production();
        System.out.println("Number of factory employees: " + Workers.Worker.getWorkersNum());
        System.out.println(shop.toString());
        pastaFactory.setNumberOfFlour(scooperfield.buyFlour(shop.getFlourCost(), pastaFactory.getNeedFlour()));
        System.out.println(pastaFactory.toString());
//-----------------------------------------------------
        System.out.println("Workers are " + workers.getStatus());
        if (workers.getStatus().equals(CharacterStatus.WORKING.getStatus())) {
            pastaFactory.setStatus(PlaceStatus.WORKING.getStatus());
        }
        System.out.println("PastaFactory is " + pastaFactory.getStatus());
        scooperfield.setSalary(shop.getFlourCost() * (float) 1.5);
        System.out.println("Scooperfield earns " + scooperfield.getSalary() + " ferting");
        if (workers.getSalary() == 0.5) {
            workers.setStatus(CharacterStatus.OUTRAGED.getStatus() + " and " + CharacterStatus.HUNGRY.getStatus());
            System.out.println("Workers are " + workers.getStatus());
        }
        if (!scooperfield.isWantToUpSalary()) {
            System.out.println("Scooperfield doesn't want to rise salary");
            workers.setStatus(CharacterStatus.STOPPED.getStatus());
            System.out.println("Workers " + workers.getStatus());
        }
        if (workers.getStatus().equals(CharacterStatus.STOPPED.getStatus())) {
            pastaFactory.setStatus(PlaceStatus.STOPPED.getStatus());
        }
        System.out.println("PastaFactory is " + pastaFactory.getStatus());
        scooperfield.setSalary(0);
        System.out.println("Scooperfield's salary is " + scooperfield.getSalary() + " ferting");
        System.err.printf("%80s", "The end.\n");

    }

    public class Start {

        void startPhrase() {
            System.out.println("\n" + phrase + "\n");
        }
    }

}
