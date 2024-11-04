# Invoicify-Billing-Application

An overview of the Invoicify  billing application. The application enables seamless invoice generation, payment processing, and account management for users and accountants, streamlining the billing process.
Overview
**User Management:** Admins can create, update, and delete users(Accountants and customers).
**Customer Management:** Admin and Accountant can create ,update, and search of customer profiles.
**Product Catalog:** Admin can add, update and delete the products.
**Invoice Management:** Admin and accountant can generate invoices for customers and track payment status.
**Payment Recording:** The system will allow users to record and track payments against invoices.
**Reporting and Analytics:** Admin can view analytics report for invoices, payments, outstanding balances, and customer billing history.



**Key Features**

**1. User Management**

**Role-Based Access Control:** Admins have the authority to create, update, and delete user profiles for both accountants and customers.

**User Creation:** Admins can add new accountants and customers, 

**User Update:** Admins can modify user information, including name, email, city, Mobile number.

**User Deletion:** Admins have the capability to remove accountants and customer. While Accountant can delete only customers.

**Separate Access Views:** Admins can view all users(Accountants and customers), while accountants can only see customer profiles.

**Automated Account Notification:** Upon successful account creation, an email is automatically sent to new accountants and customers, containing their login credentials, enhancing the onboarding experience.


**2. Customer Management**

**Profile Management:** Customers can securely manage their profile by updating their password.

**Payments:** Pending invoices can be paid conveniently using wallet funds, allowing for a streamlined and secure payment experience.

**Order History:** Customers can view a detailed history of their orders, including past invoices, and any outstanding balances, providing a complete overview of their billing history.


**3. Product Catalog**

**Admin-Only Management:** Only admins can manage product catalog changes.

**Product Addition:** Admins can add new products, including product name, description, price, and category.

**Product Update:** Product information can be edited, allowing updates to prices, descriptions, or other details.

**Product Deletion:** Products can be removed if discontinued, keeping the catalog relevant and organized.


**4. Invoice Management**

**Multi-Role Access:** Both admins and accountants can generate invoices for customers.

**Invoice Generation:** Invoices are created by selecting products, with details like customer name and customer email.

**Automated Calculations:** Total amount is automatically calculated, which reduces manual work.

**Invoice Status Tracking:** Admins and accountants can monitor invoice statuses, such as paid or unpaid, with real-time updates.

**PDF Generation:** The application allows invoice generation in PDF format for easy sharing and record-keeping.

**Automated Invoice Notification:** Upon successful invoice creation, an email is sent to the customer, including invoice details, the list of products, invoice ID, and the total amount.


**5. Payment Recording**

**Payment Methods:** The application is designed to support only wallet payments.

**Full Payment Only:** The system enforces complete payments against invoices, simplifying payment tracking.

**Payment History:** Every payment made against an invoice is recorded, capturing the payment amount, date, and payer.

**Invoice Status Update:** Once a payment is recorded, the invoice status updates automatically to "paid" or "unpaid."

**Customer Payment History:** Full payment records are maintained, allowing access to customer billing history and enabling efficient follow-up.

**Payment Confirmation Notification:** After a successful payment, an automated email is sent to the customer.


**6. Reporting and Analytics**

**Admin-Only Access:** Analytics are accessible exclusively to admins, ensuring sensitive financial data remains confidential.

**Financial Overview:** Provides detailed insights into invoices, payments, and outstanding balances, helping admins assess the financial status of the business.

**Invoice Analytics:** Generates reports based on paid and unpaid invoices, giving admins a clear view of revenue and outstanding collections.

**Customer Billing History:** Generates detailed reports of customer billing activities, which can inform customer relations.



**Technology Stack:

Backend:

Spring Boot:** Provides RESTful APIs for managing properties, tenants, and contracts.

**MySQL:** For data persistence, storing property details, user information, and lease agreement.


**Frontend:**

**React:** For building a dynamic user interface, allowing users to view and interact with the system in real time.


**API Testing:

Postman:** For testing backend APIs and ensuring that data is being processed and returned correctly.


**Additional Tools:

Spring Data JPA:** To interact with the database and manage data operations in a more abstracted way.
