# 🍳 Chef AI

ChefAI is an AI-powered recipe generation tool that creates personalized recipes based on the ingredients you have, your preferred cuisine, and any dietary restrictions. Built using Spring Boot and integrated with a chat-based AI model (like LLaMA), it turns your kitchen inputs into delicious outputs.

---

## 🚀 Features

- 🧠 Generates recipes using natural language AI
- 🥦 Accepts ingredients, cuisine type, and dietary restrictions
- 📃 Outputs a recipe title, ingredients list, and step-by-step instructions
- 🌍 Supports multiple cuisines and dietary preferences

---

## 📦 Technologies Used

- Java
- Spring Boot
- Spring AI
- LLaMA 3 / GPT models

---

## 🧑‍💻 Author

**Faizan Khan**  
> Passionate about AI and backend development, with a focus on building efficient, clean, and scalable applications.

---

### 🎯 Endpoint: Generate Recipe

**URL**: `/ask/ai/recipeCreator`

**Method**: `GET`

**Query Parameters**:
| Parameter            | Type   | Required | Description                          |
|----------------------|--------|----------|--------------------------------------|
| `ingredients`        | String | ✅ Yes   | Comma-separated list of ingredients |
| `cuisine`            | String | ❌ No    | Type of cuisine (e.g., Italian)     |
| `dietaryRestriction` | String | ❌ No    | Any dietary constraints              |

**Example**:

```http
GET /ask/ai/recipeCreator?ingredients=tomato,garlic&cuisine=Indian&dietaryRestriction=vegan
