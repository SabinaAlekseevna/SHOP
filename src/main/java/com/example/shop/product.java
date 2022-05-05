/**
 * Слой доступа к данным.
 * @author SabinaTanya
 */

package com.example.shop;

/**
 * Класс описания полей, предоставления доступа к ним
 */
public class Product {
    /** Поле "Название товара" */
    String product_name;
    /** Поле "Размер" */
    String size;
    /** Поле "Номер размера" */
    int id_size;
    /** Поле "Цена" */
    int price_RUB;
    /** Поле "Цвет" */
    String colour;
    /** Поле "Количество" */
    int quantity;
    /** Поле "Состав" */
    String structure;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param colour - цвет
     * @param id_size - номер размера
     * @param price_RUB - цена
     * @param product_name - название товара
     * @param quantity - количество
     * @param size - размер
     * @param structure - состав
     * @see Product
     */
    public Product(String product_name, String size, int id_size, int price_RUB, String colour, int quantity, String structure) {
        this.product_name = product_name;
        this.size = size;
        this.id_size = id_size;
        this.price_RUB = price_RUB;
        this.colour = colour;
        this.quantity = quantity;
        this.structure = structure;
    }

    /**
     * Функция получения значения поля {@link Product#product_name}
     * @return возвращает название товара
     */
    public String getProduct_name() {
        return product_name;
    }
    /**
     * Функция получения значения поля {@link Product#size}
     * @return возвращает размер товара
     */
    public String getSize() {
        return size;
    }

    /**
     * Функция получения значения поля {@link Product#id_size}
     * @return возвращает номер размера товара
     */
    public int getId_size() {
        return id_size;
    }

    /**
     * Функция получения значения поля {@link Product#price_RUB}
     * @return возвращает цену товара
     */
    public int getPrice_RUB() {
        return price_RUB;
    }

    /**
     * Функция получения значения поля {@link Product#colour}
     * @return возвращает цвет товара
     */
    public String getColour() {
        return colour;
    }

    /**
     * Функция получения значения поля {@link Product#quantity}
     * @return возвращает количество товара в магазине
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Функция получения значения поля {@link Product#product_name}
     * @return возвращает название продукта
     */
    public String getStructure() {
        return structure;
    }

    /**
     * Функция для доступа к присваиванию значений полю {@link Product#product_name}
     */
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    /**
     * Функция для доступа к присваиванию значений полю {@link Product#size}
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Функция для доступа к присваиванию значений полю {@link Product#id_size}
     */
    public void setId_size(int id_size) {
        this.id_size = id_size;
    }

    /**
     * Функция для доступа к присваиванию значений полю {@link Product#price_RUB}
     */
    public void setPrice_RUB(int price_RUB) {
        this.price_RUB = price_RUB;
    }

    /**
     * Функция для доступа к присваиванию значений полю {@link Product#colour}
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * Функция для доступа к присваиванию значений полю {@link Product#quantity}
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Функция для доступа к присваиванию значений полю {@link Product#structure}
     */
    public void setStructure(String structure) {
        this.structure = structure;
    }


}
