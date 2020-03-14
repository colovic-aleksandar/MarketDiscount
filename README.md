Classes Path:
market\MarketDiscount\appClientModule\

Main.Java:

 I asked user to input month turnover, purchase value and discount card.
I put these lines inside of a try block to check if there is a input error. Depending on user discount card input value, specified  method will invoke. Because of 3 type of cards, there are 3 type of methods and 3 type of inputs user can input(bronze,silver,gold). That input I converted to lowercase (so the input doesn't have to be case sensitve). If any of users inputs are not valid, error will be printed.

PayDesk.java:

I made 3 methods(Bronze, Silver, Gold). They all have same values:
to //which specifies monthly turnover 
and pv //which specifies purchase value

Bronze:

I declared dr(discount rate), disc(discount) and total.
I ran if statement to check if monthly turnover is less then 100, between 100 and 300 or greater. 
If it's less discount rate is 0, if it's in between discount rate is 1 and if it's higher then  discount rate is 2.5
I used discount formula: (discount rate)*(purchase value) and then devided by 100 to get valid discount percentage.
To get total i subtracted discount from purchase value. After All that, i printed the results.

Silver:
Similar algoritham was used here but the only difference was if statement. If monthly turnover is higher then 300, discount rate is 3.5, else is 2.

Gold:

In Gold method default discount rate is 2. Inside integer p variable, I devided monthly turnover by 100 to get how many 100s are in monthly turnover. I checked if monthly turnover is greater then 100 and then added p to discount rate. Then I checked if discount rate is greater then 10 and if it is, then i set discount rate to 10( can't be larger then that). Then I used total and discount formula(like in last two methods) and printed the results.
