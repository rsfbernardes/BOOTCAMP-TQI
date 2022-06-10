class bankAccount {
    constructor(agencyNumber, accountNumber, accountType) {
        this.agencyNumber = agencyNumber;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this._accountBalance = 0
    }

    get accountBalance() {
        return this._accountBalance;
    }

    set accountBalance(valueBalance) {
        this._accountBalance = valueBalance;
    }

    withdraw(valueWithdraw) {
        if ((valueWithdraw > 0) && (this._accountBalance > 0) && (valueWithdraw <= this._accountBalance)) {
            this._accountBalance = this._accountBalance - valueWithdraw;
        }
        else {
            return "This operation cannot be done!";
        }
        return this._accountBalance;
    }

    deposit(valueDeposit) {
        if (valueDeposit > 0) {
            this._accountBalance = this._accountBalance + valueDeposit;
        }
        return this._accountBalance
    }
}

class currentAccount extends bankAccount{
    constructor(agencyNumber, accountNumber, hasCreditCard) {
        super(agencyNumber, accountNumber);
        this.accountType = "Current";
        this.hasCreditCard = hasCreditCard;
        this._accountBalance = 0;
    }

    get creditCard() {
        return this.hasCreditCard;
    }

    set creditCard(hasCreditCard) {
        this.hasCreditCard = hasCreditCard;
    }
}

class savingsAccount extends bankAccount{
    constructor(accountAgency, accountNumber) {
        super(accountAgency, accountNumber);
        this.accountType = "Savings";
        this._accountBalance = 0;
    }
}

class universityAccount extends bankAccount {
    constructor(accountAgency, accountNumber) {
        super(accountAgency, accountNumber);
        this.accountType = "University";
        this._accountBalance = 0;
    }

    withdraw(valueWithdraw) {
        if ((valueWithdraw > 0) && (valueWithdraw <= 500) && (this._accountBalance > 0) && (valueWithdraw <= this._accountBalance)) {
            this._accountBalance = this._accountBalance - valueWithdraw;
        }
        else {
            return "This operation cannot be done!";
        }
        return this._accountBalance;
    }
}