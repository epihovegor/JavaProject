package HW_2;

public class HW_2_2 {
    public static void main(String[] args) {
        int totalLoot = 500; // Всего награблено пиастр.
        int Pirates = 25; //Пиратов на корабле.

        int ownerShare = totalLoot / 2; //Владелец корабля забирает половину
        int captansShere = (totalLoot - ownerShare) / 2; //Доля капитана без доли, как члена экипажа
        int comandShere = (totalLoot- ownerShare - captansShere) / Pirates; //Добыча для команды

        int total = ownerShare + captansShere + comandShere * Pirates; //Сколько всего раздали денег

        //Выводим результаты
        System.out.print("Владельцу судна: ");
        System.out.println(ownerShare);
        System.out.print("Капитану корабля: ");
        System.out.println(captansShere + comandShere);
        System.out.print("Рядовому члену экипажа: ");
        System.out.println(comandShere);
        System.out.print("ИТОГО: ");
        System.out.println(total);
        System.out.print("Остаток: ");
        System.out.println(totalLoot - total);

    }
}
