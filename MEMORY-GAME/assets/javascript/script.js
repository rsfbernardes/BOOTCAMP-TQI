const cards = document.querySelectorAll('.card');
let hasFlippedCard = false;
let firstCard, SecondCard;

function flipCard() {
    this.classList.add('flip');
    if (!hasFlippedCard) {
        hasFlippedCard = true;
        firstCard = this;
        return;
    }

    SecondCard = this;
    checkForMatch();
}

cards.forEach((card) => {
    card.addEventListener('click', flipCard);
})

