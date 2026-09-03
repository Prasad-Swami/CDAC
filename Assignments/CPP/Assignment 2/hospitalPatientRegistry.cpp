#include <iostream>
using namespace std;

class Patient{
    private:
    int patientid;
    string name;
    int age;
    string ward;
    const string bloodGroup;

    public:

    string constructorType;

    Patient(): bloodGroup("O+"){
        constructorType = "Default Patient Registred.";
        patientid = 0;
        name = "unknown";
        age = 0;
        ward = "Genral";
        //this -> bloodGroup = bloodGroup 

    }

    Patient(int id, const string& name):bloodGroup("O+"), age(0){
        constructorType = "Emergency";
        patientid = id;
        this -> name = name;
    }

    Patient(int id, const string& name, int age, const string& ward, const string& bg): bloodGroup(bg){
        constructorType = "Full details";
        patientid = id;
        this -> age = age;
        this -> name = name;
        this -> ward = ward;
    }

    ~Patient(){
        cout << "Patient " << name << " discharged" << endl;
    }

    
    void displayRecord() const{
        cout << "[Constructor] " << constructorType << " " << name << endl;
        cout << "Patient Record: " << endl;
        cout << "ID: " << patientid << endl;
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
        cout << "Bloodgroup: " << bloodGroup << endl;
        cout << "Ward: " << ward << endl;
    }
    
    void transferWard(const string& newWard){
        ward = newWard;
        cout << "Ward Tranfer: " << name << "-> " << ward << endl;
    }
};


int main(){
    string ward = "Special";
    
    Patient **patients = new Patient*[4];

    patients[0] = new Patient;
    patients[1] = new Patient(102, "Joe", 25, "Genral", "O+");
    patients[2] = new Patient(101, "Ryan");
    patients[3] = new Patient;

    for (int i = 0; i < 4; i++){
        patients[i] -> displayRecord();
    }

    for(int i = 0; i < 4; i++){
        patients[i] ->transferWard(ward);
    }

    for (int i = 0; i < 4; i++) {
        
        delete patients[i];
    }

    delete[] patients;
}