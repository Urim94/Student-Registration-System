<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive Layout</title>
    <link rel="stylesheet" href="style.css">
</head>
    <body>
        <h2 style="text-align: center;">Our Menu</h2>
        <div class="container">
            <section class="section">
                <h2 class="section-title"; style="background-color: rgb(203, 122, 95);">Chicken</h2>
                <p class="dummy-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce tempor libero ac augue hendrerit, ac blandit orci malesuada.</p>
            </section>
            <section class="section">
                <h2 class="section-title"; style="background-color: rgb(205, 69, 69);">Beef</h2>
                <p class="dummy-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce tempor libero ac augue hendrerit, ac blandit orci malesuada.</p>
            </section>
            <section class="section">
                <h2 class="section-title"; style="background-color: yellow;">Sushi</h2>
                <p class="dummy-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce tempor libero ac augue hendrerit, ac blandit orci malesuada.</p>
            </section>
        </div>
    </body>
</html>
body {
    margin: 10px;
    font-family: Arial, sans-serif; /* Optional: Setting a specific font-family */
}

.container {
    margin: 0px;
}

.section {
    float: left;
    width: calc(33.3333% - 20px); /* 20px accounts for margin between sections */
    background-color: #f2f2f2; /* Example background color */
    border: 1px solid black;
    box-sizing: border-box;
    margin: 10px; /* Spacing between sections */
    position: relative;
}

.section-title {
    position: absolute;
    top: 0;
    right: 0;
    padding: 5px;
    margin: 0;
    border: 1px solid black;
    font-size: 125%; /* Optional: 25% larger font size than dummy text */
}
.dummy-text {
    padding: 10px;
    margin: 10px;
    font-size: 16px; /* Example font size */
}@media(max-width: 767px) {
    .section {
        width: calc(100% - 20px);
        clear: both;
    }
}

@media (min-width: 767px) and (max-width: 991px) {
    .section {
        width: calc(50% - 20px); /* 20px accounts for margin between sections */
        float: left;
    }
    .section:nth-child(3) {
        width: calc(100% - 20px);
    }
}
