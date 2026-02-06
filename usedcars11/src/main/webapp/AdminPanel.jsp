<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Admin Dashboard | Used Cars</title>

    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" />
    <!-- Icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet" />

    <style>
        body {
            background: linear-gradient(135deg, #cfd9df, #e2ebf0);
            min-height: 100vh;
            padding: 30px;
        }
        .dashboard-title {
            font-weight: 800;
            color: #2c3e50;
        }
        .admin-card {
            border-radius: 20px;
            color: white;
            padding: 30px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
            transition: transform 0.3s, box-shadow 0.3s;
            cursor: pointer;
        }
        .admin-card:hover {
            transform: translateY(-8px) scale(1.02);
            box-shadow: 0 15px 30px rgba(0,0,0,0.3);
        }
        .card-add { background: linear-gradient(135deg, #43cea2, #185a9d); }
        .card-edit { background: linear-gradient(135deg, #f7971e, #ffd200); color: #333; }
        .card-delete { background: linear-gradient(135deg, #ff416c, #ff4b2b); }
        .card-enquiry { background: linear-gradient(135deg, #8360c3, #2ebf91); }
        .card-list { background: linear-gradient(135deg, #00c6ff, #0072ff); }
        .card-enquiry-list { background: linear-gradient(135deg, #f953c6, #b91d73); }
        .admin-card i {
            font-size: 3rem;
            margin-bottom: 15px;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="text-center mb-5">
        <h1 class="dashboard-title">Admin Dashboard</h1>
        <p class="text-muted">Used Cars Management Panel</p>
    </div>

    <div class="row g-4">
        <!-- Add Car -->
        <div class="col-md-4">
            <div class="admin-card card-add text-center">
                <i class="bi bi-plus-circle"></i>
                <h4>Add Car</h4>
                <p>Add new used car details</p>
                <a href="/newcar" class="btn btn-success">Open</a>
            </div>
        </div>

        <!-- Modify Car -->
        <div class="col-md-4">
            <div class="admin-card card-edit text-center">
                <i class="bi bi-pencil-square"></i>
                <h4>Modify Car Info</h4>
                <p>Edit existing car information</p>
                <a href="/modify" class="btn btn-primary">Open</a>
            </div>
        </div>

        <!-- Delete Car -->
        <div class="col-md-4">
            <div class="admin-card card-delete text-center">
                <i class="bi bi-trash"></i>
                <h4>Delete Car</h4>
                <p>Remove car from listing</p>
                <a href="deletecar" class="btn btn-success">Open</a>
            </div>
        </div>

        <!-- Add Enquiry -->
        <div class="col-md-4">
            <div class="admin-card card-enquiry text-center">
                <i class="bi bi-chat-dots"></i>
                <h4>Add Enquiry</h4>
                <p>Record customer enquiry</p>
                 <a href="newenq" class="btn btn-secondary">Open</a>
            </div>
        </div>

        <!-- Car List -->
        <div class="col-md-4">
            <div class="admin-card card-list text-center">
                <i class="bi bi-car-front"></i>
                <h4>Car List</h4>
                <p>View all used cars</p>
                <a href="cars" class="btn btn-info">Open</a>
            </div>
        </div>

        <!-- Enquiry List -->
        <div class="col-md-4">
            <div class="admin-card card-enquiry-list text-center">
                <i class="bi bi-card-list"></i>
                <h4>Enquiry List</h4>
                <p>View customer enquiries</p>
                <a href="newenq" class="btn btn-warning">Open</a>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
    