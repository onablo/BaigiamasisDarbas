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
- Click Photo-formats "10x15"
- Get expect text in opened window

### 2. Check photo frame ordered function from products list
- Click products submenu
- Close cookies agreement with waiting
- Click "Souvenir frames"
- Click "Frame-wd10-10x15"
- Choose product quantity  
- Click add to Cart
- Expect text in opened window "Preke itraukta i krepseli"

### 3. Check selected products price and total price in cart 
- Click on Gift Ideas in menu list 
- Close cookies agreement with waiting
- Select Gift Coupons
- Select Gift Coupon(price 5 €) 
- Add selected Coupon to Cart
- Press "Buy" on appeared popup
- Expect selected Gift Coupon price and Cart total amount is the same

### 4. Check Login with username
- Click Login 
- Fill Email input 
- Fill Password input
- Press Login button
- Expect Logout option in home page 

### 5. Check login without registration
- Click products submenu
- Close cookies agreement with waiting
- Click "Souvenir frames "
- Click "Frame-wd10-10x15"
- To choose product quantity
- Click add to Cart
- Click Buy button on appear popup
- Click on order Submit button
- Click continue without registration
- Fill input Name
- Fill input Surname
- Fill input Email
- Fill input Phone
- Click Free Delivery
- Select Delivery address
- Click continue
- Expect get payment options

## Challenges
  Difficulty in finding XPaths for element locations