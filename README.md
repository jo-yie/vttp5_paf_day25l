# Day 25 Lecture  
## Tuesday 14 Jan 2025  

Redis Pub/Sub Lecture Example

### **POST /api/messages**  

#### **Request Body:**  
```json
{
  "id": 5,
  "taskName": "task name"
}
```

#### **Response Body:**  
```
Message sent
```

#### **Consumer Terminal Output:**  
```
Todo [id=5, taskName=task name]
```
