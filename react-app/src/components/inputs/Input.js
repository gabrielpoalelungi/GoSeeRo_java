import React from "react";

function Input({ inputName, inputValue, inputType, labelText, handleChange }) {
  return (
    <div className="form-group">
      <label htmlFor={inputName}>{labelText}</label>
      <input
        type={inputType}
        id={inputName}
        name={inputName}
        value={inputValue}
        placeholder={labelText}
        onChange={handleChange}
      />
    </div>
  );
}

export default Input;
