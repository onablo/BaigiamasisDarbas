# **Maven + Java + Selenium demo project**
## Setup
### Packages used
- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`
### Site used for testing

[FotoServis](https://www.fotoservisas.lt)

****Final work published at:****
*https://github.com/onablo/BaigiamasisDarbas.git*

## Testing cases:

### 1. Check photo ordered function, ordering photo 10x15 from list
- Click photo categories submenu
- Close cookies agreement with waiting
- Click photo-formats "10x15"
- Get expected text in opened window

### 2. Check photo frame ordered function from products list
- Click products submenu
- Close cookies agreement with waiting
- Click "Suvenyriniai-remeliai"
- Click "Frame-wd10-10x15"
- To choose product quantity  
- Click add to order list
- Expected text in opened window "Preke itraukta i krepseli"

### 3. Check selected products price and total price in cart 
- Click on Gift Ideas in menu list 
- Close cookies agreement with waiting
- Select Gift Coupons
- Select gift coupon(price 5 €) 
- Add selected coupon to cart
- Press "Buy" on appeared popup
- Expect selected gift coupon price and cart total amount is the same

### 4. Check Login with username
- Click Login 
- Fill Email input 
- Fill Password input
- Press login button
- Expected logout option in home page 

### 5. Check login without registration