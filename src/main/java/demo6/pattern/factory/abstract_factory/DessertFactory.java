package demo6.pattern.factory.abstract_factory;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/12 0012 15:59
 */
public interface DessertFactory {

    //生产咖啡的功能
    Coffee createCoffee();

    //生产甜品的功能
    Dessert createDessert();

}
