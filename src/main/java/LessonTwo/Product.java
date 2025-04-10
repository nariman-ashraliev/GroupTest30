package LessonTwo;


    public class Product {
        private String name;
        private String productionDate;
        private String manufacturer;
        private String country;
        private double price;
        private boolean status;

        public Product(String name, String productionDate, String manufacturer, String country,double price,boolean status) {
            this.name = name;
            this.productionDate = productionDate;
            this.manufacturer = manufacturer;
            this.country = country;
            this.price = price;
            this.status = status;
        }



        public void printInfo(){
            System.out.println("Название: "+name+ "Дата производства: "+productionDate+ "Производитель: "+manufacturer+ "Страна происхождения: "+country+ "Цена: "+price+ "Забронировано: "+ (status ? "Да": "Нет"));
        }

    }
