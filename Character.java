public class Character{
    public  String name;
    public int hp;
    public int mp;
    public int atk;

    public Character(String name,int hp,int mp,int atk){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
    }

    public void print_status(){
        System.out.print("NAME:" + this.name);
        System.out.print(" HP:" + this.hp);
        System.out.print(" MP:" + this.mp);
        System.out.println(" ATK:" + this.atk);
    }

    public void  healing(int power){
        if(this.mp >= power){
            System.out.print(this.name + "は");
            System.out.println(power + "回復した！");
            this.mp -= power;
            this.hp += power;
        }
        else{
            System.out.println("MPが足りない!");
        }
    }

    public void attack(Character target){
        System.out.print(this.name + "の攻撃!");
        System.out.println(target.name + "に" + this.atk + "ダメージ!");
        target.hp -= this.atk;
    }
}