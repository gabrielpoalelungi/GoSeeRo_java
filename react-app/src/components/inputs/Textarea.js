import React from "react";

function Textarea({
  inputName,
  inputValue,
  inputType,
  labelText,
  handleChange,
}) {
  return (
    <div className="form-group">
      <label htmlFor={inputName}>{labelText}</label>
      <textarea
        type={inputType}
        id={inputName}
        name={inputName}
        value={inputValue}
        placeholder={labelText}
        onChange={handleChange}
      ></textarea>
    </div>
  );
}

export default Textarea;
