package class3studio;

public class MenuItem {

        private Double price;
        private String description;
        private String category;
        private Boolean isNew;

	public MenuItem(Double price, String description, String category, Boolean isNew) {
            this.price = price;
            this.description = description;
            this.category = category;
            this.isNew = isNew;
        }

        public Double getPrice() {
            return price;
        }

        public String getDescription() {
            return description;
        }

        public String getCategory() {
            return category;
        }

        public Boolean getNew() {
            return isNew;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public void setNew(Boolean isNew) {
            this.isNew = isNew;
        }
}
