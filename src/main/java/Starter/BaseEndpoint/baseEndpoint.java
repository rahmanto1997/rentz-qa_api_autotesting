package Starter.BaseEndpoint;

public class baseEndpoint {
    public String BASE_URL = "https://rentz-id.site";
    public String REGISTER = BASE_URL + "/signup";
    public String LOGIN = BASE_URL + "/signin";
    public String GetAllProduct = BASE_URL+"/products";
    public String GetProductID = BASE_URL+"/products/";
    public String GetProductSID = BASE_URL+"/products/subcategory/";
    public String User = BASE_URL+"/jwt/users";
    public String Product = BASE_URL+"/jwt/products";
    public String DeleteProduct = BASE_URL+"/jwt/products/";
    public String CreateBooking = BASE_URL+"/jwt/booking";
    public String SearchBooking = BASE_URL+"/booking/check/";
    public String GETAllBooking = BASE_URL+"/jwt/cart";
    public String GETBookingID = BASE_URL+"/jwt/booking/";
    public String DeleteBookingID = BASE_URL+"/jwt/booking/";
    public String CheckoutOvo = BASE_URL+"/jwt/checkout/ovo";
    public String CheckoutOtherThanOvo = BASE_URL+"/jwt/checkout";
}
