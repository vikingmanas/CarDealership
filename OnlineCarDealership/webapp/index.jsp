<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modern Online Car Dealership</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

    <nav class="navbar">
        <a href="#" class="navbar-brand">
            <img src="images/logo.png" alt="logo">
        </a>
        <div class="navbar-links">
            <a href="#">Home</a>
            <a href="#">Why Us</a>
            <a href="#">Inventory</a>
            <a href="#">Contact</a>
        </div>
    </nav>

    <header class="header">
        <h1>Welcome to Our Modern Online Car Dealership</h1>
        <p>Your premier destination for the finest cars!</p>
    </header>

    <section class="inventory">
        <h2>Our Inventory</h2>
        <div class="inventory-container">
            <!-- Cars will be dynamically added here from Java backend -->
            <%
                InventoryDAO inventoryDAO = new InventoryDAO();
                List<Car> cars = inventoryDAO.getAllCars();
                for (Car car : cars) {
            %>
            <div class="car-card">
                <img src="<%= car.getImageUrl() %>" alt="<%= car.getModel() %>">
                <h3><%= car.getModel() %></h3>
                <p>Price: $<%= car.getPrice() %></p>
            </div>
            <% } %>
        </div>
    </section>

    <footer>
        <p>&copy; 2024 Modern Online Car Dealership. All Rights Reserved.</p>
    </footer>

    <script src="js/script.js"></script>
</body>
</html>
