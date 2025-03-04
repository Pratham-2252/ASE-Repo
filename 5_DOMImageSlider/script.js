const images = [
    "https://www.w3schools.com/w3images/lights.jpg",
    "https://www.w3schools.com/w3images/mountains.jpg",
    "https://www.w3schools.com/w3images/nature.jpg",
    "https://www.w3schools.com/w3images/forest.jpg",
    "https://www.w3schools.com/w3images/ocean.jpg"
];

let currentIndex = 0;

const sliderImage = document.getElementById("slider-image");
const prevBtn = document.getElementById("prevBtn");
const nextBtn = document.getElementById("nextBtn");

function updateImage() {
    sliderImage.src = images[currentIndex];
}

prevBtn.addEventListener("click", () => {
    currentIndex = (currentIndex === 0) ? images.length - 1 : currentIndex - 1;
    updateImage();
});

nextBtn.addEventListener("click", () => {
    currentIndex = (currentIndex === images.length - 1) ? 0 : currentIndex + 1;
    updateImage();
});

updateImage();
