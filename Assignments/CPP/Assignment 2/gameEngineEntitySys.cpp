#include <iostream>
#include <cstdlib>
using namespace std;

class Entity{
    private:
    string name;
    int health;
    int level;
    string type;

    public:

    //setter

    Entity& setName(const string& name){
            this -> name = name;
            return *this;
        
    }

    Entity& setHealth(int health){
        this -> health = health;
        return *this;
    }

    Entity& setLevel(int level){
        this -> level = level;
        return *this;
    }

    Entity& setType(const string& type){
        if(type == "Player"){
            this -> type = type;
        }else if(type == "Enemy"){
            this -> type = type;
        }else if(type == "Item"){
            this -> type = type;
        }else{
            cout << "Invalid Type";
        }
        
        return *this;

    }

    //getters

    string getName() const{
        return name;
    }

    int getHealth() const{
        return health;
    }

    int getLevel() const{
        return level;
    }

    string getType() const{
        return type;
    }

    void displayInfo() const{
        cout << "Name: " << getName() << endl;
        cout << "Health: " << getHealth() << endl;
        cout << "Level: " << getLevel() << endl;
        cout << "item: " << getType() << endl;
    }

    
    
};

namespace Physics{
    double clamp(double val, double min, double max){
        if(val < min){
            return min;
        }else if(val > max){
            return max;
        }else{
            return val;
        }
    }

    double lerp(double a, double b, double t){
        
        return a * (1.0 - t) + b * t;
    }
}

namespace GameMath{
    double clamp(int val, int min, int max){
        if(val < min){
            return min;
        }else if(val > max){
            return max;
        }else{
            return val;
        }
        
    }

    double lerp(double a, double b, double t){
        
        return a * (1.0 - t) + b * t;

    }
}
int main(){
    cout << "Entity     Player      enemy       item" << endl;
    Entity p1;
    Entity p2;
    Entity p3;
    
    p1.setName("Halo").setHealth(100).setLevel(5).setType("Player");
    
    p2.setName("Ultron").setHealth(75).setLevel(7).setType("Enemy");
    cout << "Item" << endl;
    p3.setName("Boost Power").setHealth(0).setLevel(1).setType("Item");

    cout << "Player" << endl;
    p1.displayInfo();
    cout << "Enemy" << endl;
    p2.displayInfo();
    cout << "Item" << endl;
    p3.displayInfo();


    int r;
    int c;

    cout << "Enter the Value of R: " << endl;
    cin >> r;

    cout << "Enter the Value of C: " << endl;
    cin >> c;

    int** gameMap = new int*[r];

    for(int i = 0; i < r; i++){
        gameMap[i] = new int [c];
    }

    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            gameMap[i][j] = rand() % 5;
        }
    }


    //display
    cout << " ======== Game Map " << r << " * " << c << "========" << endl;
    for(int i = 0; i < r ; i++){
        for (int j = 0; j < c; j++){
            cout << gameMap[i][j] << " ";
        }
        cout << endl;
    }
    cout << endl;
    cout << "Legend: 0 = Grass  1 = Water   2 = Mountain    3 = Forest  4 = Dungeon" << endl;

    //Tile Count
    cout << "Tile Count: " << endl;

    int grass = 0;
    int water = 0;
    int mountain = 0;
    int forest = 0;
    int dungeon = 0;

    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            if(gameMap[i][j] == 0){
                grass += 1;                
            }else if(gameMap[i][j] == 1){
                water += 1;
            }else if(gameMap[i][j] == 2){
                mountain += 1;
            }else if(gameMap[i][j] == 3){
                forest += 1;
            }else if(gameMap[i][j] == 4){
                dungeon += 1;
            }else{
                cout << "error";
            }
        }
    }

    cout << "Grass: " << grass << endl;
    cout << "Water: " << water << endl;
    cout << "Mountain: " << mountain << endl;
    cout << "Dungeon: " << dungeon << endl;

    //int grid = rand() % 4;

    //free
    for(int i = 0; i < r; i++){
        delete[] gameMap[i];
    }

    delete[] gameMap;

    return 0;

}