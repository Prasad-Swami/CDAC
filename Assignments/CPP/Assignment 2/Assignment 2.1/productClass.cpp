#include <iostream>
using namespace std;

class Product{
    private:
        int productId;
        string name;
        double price;
        int quantity;
        double totalValue;
        
    public:
        //setters
        
        void setProduct_id(int id){
            productId = id;
        }
        
        void setName_product(string n){
            name = n;
        }
        
        void setPrice_product(double p){
            price = p;
        }
        
        void setQuantity_product(int q){
            quantity = q;
        }
        
        void setTotalValue(){
            totalValue = quantity * price;
            }
            //getter
            
        int getProductID(){
            return productId;
        }
            
        string getname(){
            return name;
        }
            
        double getprice(){
            return price;
        }
            
        int getquantity(){
                return quantity;
            }
            
        int threshold;
        int totalProducts;
        
        
        double getTotalValue() const{
            return totalValue;
        }
        void acceptDetails(){
            cout << "Product ID: " << endl;
            cin >> productId;
            cout << "Product Name: " << endl;
            cin >> name;
            cout << "Enter the price of product: " << endl;
            cin >> price;
            cout << "Total Quantities of Product: " << endl;
            cin >> quantity;
            cout << "Enter the value of Minimum Stock" << endl;
            cin >> threshold;
            // cout << "Enter the number of Products: ";
            // cin >> totalProducts;
        }


        bool isLowStock() const{
            if(quantity < threshold){
                cout << "<- LOW STOCK";
                return true;
            }
            return false;
        }

        int getThreshold() const{
            return threshold;
        }

        void displayDetails() const{
            
            cout << productId << "   " << name << "      " << price << "       " << quantity << "     " <<  getTotalValue() << "     " <<isLowStock() << endl;

            
        }
            
         

};

double reorderCost(int qty, double unitPrice){
    return qty * unitPrice;
}

double reorderCost(double qty, double unitPrice){
    return qty * unitPrice;
}

double reorderCost(int qty, double unitPrice, double taxRate){
    return (qty * unitPrice) + (taxRate * (unitPrice * qty)/100);
}

double applyDiscount(double price, double discountPercent = 10.0){
    return price * discountPercent/100;
}

int main(){
    int size; 
    cout << "Enter the total products you want to enter: " <<endl;
    cin >> size;

    Product products[size];
    
    for(int i = 0; i < size ; i++){
        products[i].acceptDetails();
        products[i].setTotalValue();

    }
    
    cout << "=============== INVENTORY REPORT ===============" << endl;
    cout << "ID" << "    Name " << "     Price " << "    Qty " << "     Total Value " << " Status" << endl;

    for(int i = 0; i < size ; i++){
        products[i].displayDetails();
    }

    double highest_value = 0.0;
    string highest_product;
    string lowstockproduct;

    for(int i = 0; i < size; i++){
        if(products[i].getTotalValue() > highest_value){
            highest_value = products[i].getTotalValue();
            highest_product = products[i].getname();
        }
    }

    cout << "Highest Value Product: " << highest_product << " " << highest_value << endl;


    for(int i = 0; i < size; i++){
        if(products[i].isLowStock()){
            cout << " (threshold)  " << products[i].getname() << endl;
        }
    }
    
    

    // Product p1;
    // Product p2;
    // Product p3;

    // p1.acceptDetails();
    // p1.setTotalValue();
    // p1.displayDetails();
    // // p1.isLowStock(30);
    // p2.acceptDetails();
    // p2.setTotalValue();
    // p2.displayDetails();
    
    // p3.acceptDetails();
    // p3.setTotalValue();
    // p3.displayDetails();
    
    for(int i = 0; i < size; i++){
        cout << "Calculate Restocking Cost: " << products[i].getname() << " "<< reorderCost(products[i].getquantity(), products[i].getprice()) << endl;
        cout << "Calculate Restocking Cost with tax: " << products[i].getname() << " "<< reorderCost(products[i].getquantity(), products[i].getprice(), 8.3) << endl;
        cout << "The Total discound applied: " << products[i].getname() << " "<< applyDiscount(products[i].getTotalValue()) << endl;

    }
    return 0;
}
