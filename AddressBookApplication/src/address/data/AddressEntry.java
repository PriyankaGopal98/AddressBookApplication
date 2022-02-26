package address.data;

    public class AddressEntry {
        private String firstName;
        private String lastName;
        private String city;
        private String email;
        private String state;
        private String street;
        private String telephone;
        private String zip;
        private String phone;

        /**
         * @param firstName first name
         * @param lastName  last name
         * @param street    street name
         * @param city      city name
         * @param state     state
         * @param email     email address
         * @param telephone telephone number
         * @param zip       zip code
         */

        public AddressEntry(String firstName, String lastName, String city, String email, String state, String street, String telephone, String zip) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.city = city;
            this.email = email;
            this.state = state;
            this.street = street;
            this.telephone = telephone;
            this.zip = zip;
        }

        public AddressEntry() {
            firstName = "Priyanka";
            lastName = "Gopal";
            street = "Rochelle Ave";
            city = "Hayward";
            state = "CA";
            zip = "94544";
            telephone = "1234567890";
            email = "123.com";
        }

        @Override
        public String toString() {
            return "First Name:" + firstName + "\n"
                    + "Last Name:" + lastName + "\n"
                    + "City:" + city + "\n"
                    + "Email:" + email + "\n"
                    + "State:" + state + "\n"
                    + "Street:" + street + "\n"
                    + "Telephone:" + telephone + "\n"
                    + "Zip:" + zip + "\n";
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getTelephone() {
            return telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

        //@overide
        public int compareTo(AddressEntry t) {
            return lastName.compareTo(t.lastName);
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

    }