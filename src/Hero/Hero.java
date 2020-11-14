package Hero;

public class Hero {


    /*  String name; //姓名

        float hp; //血量

        float armor; //护甲

        int moveSpeed; //移动速度

        public static void main(String[] args) {
            //创建一个对象
            new Hero();

            //使用一个引用来指向这个对象
            Hero h = new Hero();

        }

     */

    /*   String name;

         float hp;

         float armor;

        int moveSpeed;

    // 方法名和类名一样（包括大小写）
    // 没有返回类型
        public Hero() {
            System.out.println("实例化一个对象的时候，必然调用构造方法");
    }

    public static void main(String[] args) {
        //实例化一个对象的时候，必然调用构造方法
         Hero h = new Hero();
    }

     */
/*
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    //这个无参的构造方法，如果不写，
    //就会默认提供一个无参的构造方法
    //  public Hero(){
    //      System.out.println("调用Hero的构造方法");
    //  }

    public static void main(String[] args) {
        Hero garen =  new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;

        Hero teemo =  new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
    }

 */
//什么是构造方法
//方法名和类名一样（包括大小写）
//没有返回类型
//实例化一个对象的时候，必然调用构造方法


    /*String name;

        float hp;

        float armor;

        int moveSpeed;

        // 方法名和类名一样（包括大小写）
        // 没有返回类型
        public Hero() {
            System.out.println("实例化一个对象的时候，必然调用构造方法");
        }

        public static void main(String[] args) {
            //实例化一个对象的时候，必然调用构造方法
            Hero h = new Hero();
        }

     */


   /* 基本类型传参顶折
            基本类型传参
    在方法内，无法修改方法外的基本类型参数

    */
        String name; //姓名

        float hp; //血量

        float armor; //护甲

        int moveSpeed; //移动速度

        public Hero(){

        }

        //回血
        public void huixue(int xp){
            hp = hp + xp;
            //回血完毕后，血瓶=0
            xp=0;
        }

        public Hero(String name,float hp){
            this.name = name;
            this.hp = hp;
        }

        public static void main(String[] args) {
            Hero teemo =  new Hero("提莫",383);
            //血瓶，其值是100
            int xueping = 100;

            //提莫通过这个血瓶回血

            teemo.huixue(xueping);

            System.out.println(xueping);

        }

    }


