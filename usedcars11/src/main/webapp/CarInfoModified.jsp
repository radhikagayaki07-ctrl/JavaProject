<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Car Added Successfully</title>

    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" />
    <!-- Icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet" />

    <style>
        body {
            background: linear-gradient(135deg, #a8edea, #fed6e3);
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
            color: #28a745;
        }
        .btn-dashboard {
            background: linear-gradient(45deg, #36d1dc, #5b86e5);
            color: white;
            border: none;
            font-weight: 600;
        }
        .btn-add {
            background: linear-gradient(45deg, #ff512f, #f09819);
            color: white;
            border: none;
            font-weight: 600;
        }
    </style>
</head>
<body>

<div class="success-card">
    <i class="bi bi-check-circle-fill success-icon"></i>
    <h2 class="mt-3 text-success fw-bold">Car Modified Successfully!</h2>
    <p class="text-muted mt-2">
        New modifications are done in the database.
    </p>

    <div class="d-grid gap-3 mt-4">
        <a href="AdminPanel.jsp" class="btn btn-dashboard btn-lg">
            Go to Dashboard
        </a>
        <a href="/modify" class="btn btn-add btn-lg">
            Modify Another Car
        </a>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
