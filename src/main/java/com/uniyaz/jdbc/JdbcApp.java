package com.uniyaz.jdbc;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by AKARTAL on 11.12.2019.
 */
public class JdbcApp {

    final static String JDBC_CONNECTION_STR = "jdbc:mysql://127.0.0.1:3306/telefon_rehberi";
    final static String USERNAME = "root";
    final static String PASSWORD = "1234";

    public static void main(String[] args) {

        boolean isBaglantiHazir = baglantiyiKontrolEt();
        if (!isBaglantiHazir) {
            System.out.println("Bağlantı problemi var. Lütfen kontrol edin.");
        } else {
            kisileriListele();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ad");
            String ad = scanner.nextLine();

            System.out.println("Soyad");
            String soyad = scanner.nextLine();

            System.out.println("Telefon");
            String telefon = scanner.nextLine();

            Kisi kisi = new Kisi();
            kisi.setAdi(ad);
            kisi.setSoyadi(soyad);
            kisi.setTelefon(telefon);
            kisiEkle(kisi);

            System.out.println("Aranacak adı giriniz");
            String aranacakAd = scanner.nextLine();
            kisileriListele(aranacakAd);
        }
    }

    private static boolean baglantiyiKontrolEt() {

        try (Connection conn = DriverManager.getConnection(
                JDBC_CONNECTION_STR, USERNAME, PASSWORD)) {

            if (conn != null) {
                return true;
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private static void kisileriListele() {

        String sql = "Select * from kisi";

        try (Connection conn = DriverManager.getConnection(JDBC_CONNECTION_STR, USERNAME, PASSWORD);
                PreparedStatement preparedStatement = conn.prepareStatement(sql)) {

                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String adi = resultSet.getString("adi");
                    String soyadi = resultSet.getString("soyadi");
                    String telefon = resultSet.getString("telefon");

                    System.out.printf("%d - %s - %s - %s \n", id, adi, soyadi, telefon);
                }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void kisiEkle(Kisi kisi) {

        String sql = "insert into kisi (adi, soyadi, telefon) " +
                    "values (?, ?, ?) ";

        try (Connection conn = DriverManager.getConnection(JDBC_CONNECTION_STR, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = conn.prepareStatement(sql)) {

            preparedStatement.setString(1, kisi.getAdi());
            preparedStatement.setString(2, kisi.getSoyadi());
            preparedStatement.setString(3, kisi.getTelefon());

            int affectedRows = preparedStatement.executeUpdate();
            System.out.println(affectedRows + " satır eklendi.");
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void kisileriListele(String ad) {

        String sql = "Select * from kisi where adi like ?";

        try (Connection conn = DriverManager.getConnection(JDBC_CONNECTION_STR, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = conn.prepareStatement(sql)) {

            preparedStatement.setString(1, "%" + ad + "%");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String adi = resultSet.getString("adi");
                String soyadi = resultSet.getString("soyadi");
                String telefon = resultSet.getString("telefon");

                System.out.printf("%d - %s - %s - %s \n", id, adi, soyadi, telefon);
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
