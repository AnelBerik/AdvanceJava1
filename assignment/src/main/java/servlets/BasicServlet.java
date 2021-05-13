package servlets;

import classes.ForwardPlayer;
import classes.GoalKeeper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "BasicServlet", urlPatterns = "/basicServlet")
public class BasicServlet extends HttpServlet {
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/Hockey";
    static final String DATABASE_USER = "postgres";
    static final String DATABASE_PASSWORD = "alimzhan125";
    static final String GET_ALL_FORWARDPLAYER_RECORDS = "SELECT * FROM forwardplayer";
    static final String GET_SPECIFIC_FORWARD = "SELECT * FROM forwardplayer WHERE firstName='fname' AND lastName='lname'";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request,response);

    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String title = "Database Demo";
        String docType = "<!DOCTYPE html>";

        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(GET_ALL_FORWARDPLAYER_RECORDS);

            writer.println(docType + "<html><head><title>" + title + "</title></head><body>");
            writer.println("<h1>FORWARDS DATA</h1>");
            writer.println("<br/>");
            while (resultSet.next()) {
                int playerId = resultSet.getInt(1);
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                Date birthdate = resultSet.getDate(4);
                String team = resultSet.getString(5);
                int height = resultSet.getInt(6);
                int weight = resultSet.getInt(7);
                int games = resultSet.getInt(8);
                int pucks = resultSet.getInt(9);
                int total = resultSet.getInt(10);
                int assists = resultSet.getInt(11);
                int utilityIndicator = resultSet.getInt(12);

                writer.println("ID: " + playerId + "<br/>");
                writer.println("First name: " + firstName + "<br/>");
                writer.println("lastname: " + lastName + "<br/>");
                writer.println("birthdate: " + birthdate + "<br/>");
                writer.println("team: " + team + "<br/>");
                writer.println("height: " + height + "<br/>");
                writer.println("weight: " + weight + "<br/>");
                writer.println("games: " + games + "<br/>");
                writer.println("pucks: " + pucks + "<br/>");
                writer.println("total : " + total + "<br/>");
                writer.println("assists : " + assists + "<br/>");
                writer.println("utilityIndicator: " + utilityIndicator + "<br/>");
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        writer.println("</body></html>");


    }
    private GoalKeeper addGoalKeeper(HttpServletRequest request, HttpServletResponse response) {
        GoalKeeper goalKeeper = new GoalKeeper();
        return goalKeeper;
    }

    @Override
    public String getServletInfo() {
        return super.getServletInfo();
    }
}

