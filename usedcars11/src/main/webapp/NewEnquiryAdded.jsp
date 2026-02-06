<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Enquiry Added Successfully</title>

    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" />
    <!-- Bootstrap Icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet" />

    <style>
        body {
            background: linear-gradient(135deg, #d4fc79, #96e6a1);
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .success-card {
            background: white;
            border-radius: 25px;
            padding: 40px;
            text-align: center;
            box-shadow: 0 12px 30px rgba(0,0,0,0.25);
            max-width: 520px;
            width: 90%;
        }
        .success-icon {
            font-size: 4rem;
            color: #0d6efd;
        }
        .btn-dashboard {
            background: linear-gradient(45deg, #36d1dc, #5b86e5);
            color: white;
            border: none;
            font-weight: 600;
        }
        .btn-add {
            background: linear-gradient(45deg, #ff758c, #ff7eb3);
            color: white;
            border: none;
            font-weight: 600;
        }
    </style>
</head>
<body>

<div class="success-card">
    <i class="bi bi-chat-check-fill success-icon"></i>
    <h2 class="mt-3 text-primary fw-bold">Enquiry Submitted Successfully!</h2>
    <p class="text-muted mt-2">
        The customer enquiry has been recorded successfully in the database.
    </p>

    <div class="d-grid gap-3 mt-4">
        <a href="admin-dashboard.html" class="btn btn-dashboard btn-lg">
            Go to Dashboard
        </a>
        <a href="add-enquiry.html" class="btn btn-add btn-lg">
            Add Another Enquiry
        </a>
    </div>
</div>
 <!-- Dynamic details (Spring Boot + Thymeleaf ready) -->
            <p class="mb-1"><strong>Customer Name:</strong> <span>${enquiry.customerName}</span></p>
            <p class="mb-1"><strong>Mobile:</strong> <span>${enquiry.mobile}</span></p>
            <p class="mb-1"><strong>Enquiry Date:</strong> <span>{enquiry.enquiryDate}</span></p>
<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
