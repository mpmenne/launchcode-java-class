package com.mikemenne.launchcode.dao;

import com.mikemenne.launchcode.AppOutput;
import com.mikemenne.launchcode.MetrolinkDao;
import com.mikemenne.launchcode.Stop;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class SqliteJDBCDao implements MetrolinkDao {

    public static final String JDBC_SQLITE_METROLINK_DB = "jdbc:sqlite:metrolink.db";
    public static final String ORG_SQLITE_JDBC = "org.sqlite.JDBC";

    private AppOutput appOutput;

    public List<Stop> getStopsAllStops() {
        appOutput.print("Fetching metrolink stations...");
        try (Connection connection = getConnection();) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM stops");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Stop> stops = new ArrayList<Stop>();
            while (resultSet.next()) {
                Stop stop = new Stop();
                stop.setStopName(resultSet.getString("stop_name"));
                stop.setStopDescription(resultSet.getString("stop_desc"));
                stops.add(stop);
            }
            return stops;
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving stops");
        }
    }

    private static Connection getConnection() throws SQLException {
        try {
            Class.forName(ORG_SQLITE_JDBC);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Unable to find class for loading the database", e);
        }
        return DriverManager.getConnection(JDBC_SQLITE_METROLINK_DB);
    }

    public void setAppOutput(AppOutput appOutput) {
        this.appOutput = appOutput;
    }
}
